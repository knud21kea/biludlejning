package uds.knudsoft;

public abstract class Bil {

    String regNr, make, model;
    int year, numberOfDoors;

    public Bil (String regNr, String make, String model, int year, int numberOfDoors) {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    abstract double calculateGreenSurcharge();
}
