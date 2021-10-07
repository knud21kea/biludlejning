package uds.knudsoft;

public class Benzinebil extends Bil {

    int octaneRating;
    double kmPr;

    public Benzinebil(String regNr, String make, String model, int year, int numberOfDoors, int octaneRating, double kmPr) {
        super(regNr, make, model, year, numberOfDoors);
        this.octaneRating = octaneRating;
        this.kmPr = kmPr;
    }

    @Override
    public double calculateGreenSurcharge() {
        double afgift = 330;
        if (kmPr < 20) {
            afgift = 1050;
        }
        if (kmPr < 15) {
            afgift = 2340;
        }
        if (kmPr < 10) {
            afgift = 5500;
        }
        if (kmPr < 5) {
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
                "\nKm/l: " + kmPr +
                "\nSurcharge: " + calculateGreenSurcharge() + " kr.";
    }
}
