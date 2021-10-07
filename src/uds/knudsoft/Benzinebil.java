package uds.knudsoft;

public class Benzinebil extends Bil {

    int octaneRating;
    double kmPrL;

    public Benzinebil(String regNr, String make, String model, int year, int numberOfDoors, int octaneRating, double kmPrL) {
        super(regNr, make, model, year, numberOfDoors);
        this.octaneRating = octaneRating;
        this.kmPrL = kmPrL;
    }

    @Override
    public double calculateGreenSurcharge() {
        double afgift = 330;
        if (kmPrL < 20) {
            afgift = 1050;
        }
        if (kmPrL < 15) {
            afgift = 2340;
        }
        if (kmPrL < 10) {
            afgift = 5500;
        }
        if (kmPrL < 5) {
            afgift = 10470;
        }
        return afgift;
    }

    /*public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
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
                "\nMotor: Petrol, Octane rating: " + octaneRating +
                "\nKm/l: " + kmPrL +
                "\nSurcharge: " + calculateGreenSurcharge() + " kr.";
    }
}
