package uds.knudsoft;

public class Dieselbil extends Bil {

    boolean hasParticleFilter;
    double kmPr;

    public Dieselbil(String regNr, String make, String model, int year, int numberOfDoors, boolean hasParticleFilter, double kmPr) {
        super(regNr, make, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPr = kmPr;
    }

    @Override
    public double calculateGreenSurcharge() {
        double afgift = 330 + 130; // Petrol car + emissions surcharge
        if (kmPr < 20) {
            afgift = 1050 + 1390;
        }
        if (kmPr < 15) {
            afgift = 2340 + 1850;
        }
        if (kmPr < 10) {
            afgift = 5500 + 2770;
        }
        if (kmPr < 5) {
            afgift = 10470 + 15260;
        }
        if (!hasParticleFilter) {
            afgift += 1000; // particle surcharge
        }
        return afgift;
    }

    /*public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPr() {
        return kmPr;
    }

    public void setKmPr(int kmPr) {
        this.kmPr = kmPr;
    }*/

    @Override
    public String toString() {
        return "\nCar info:" +
                "\nMake/Model: " + make + " " + model + ", " + numberOfDoors + "-door " + year +
                "\nReg number: " + regNr +
                "\nEngine: Diesel, has particle filter? " + hasParticleFilter +
                "\nKm/l: " + kmPr +
                "\nSurcharge: " + calculateGreenSurcharge() + " kr.";
    }
}