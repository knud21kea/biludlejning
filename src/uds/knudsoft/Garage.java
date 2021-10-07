package uds.knudsoft;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> carPark = new ArrayList<>(); // list of parked cars
    private final String garageName;

    public Garage(String garageName) {
        this.garageName = garageName;
    }

    public void addCar(Bil bil) {
        carPark.add(bil);
    }

    public double calculateGreenSurchargeTotal() {
        double afgift = 0;
        for (Bil bil : carPark) {
            afgift += bil.calculateGreenSurcharge();
        }
        return afgift;
    }

    public String formatOutput() {
        StringBuilder carList = new StringBuilder();
        for (Bil bil : carPark) {
            carList.append(bil.make).append(" ").append(bil.model).append(": Reg ").append(bil.regNr).append("\n");
        }
        return carList.toString();
    }

    @Override
    public String toString() {
        return garageName +
                " has these parked cars:\n" + formatOutput() +
                "\nThe total surcharge is: " + calculateGreenSurchargeTotal() + " kr.";
    }
}
