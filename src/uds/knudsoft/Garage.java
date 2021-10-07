package uds.knudsoft;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> carPark = new ArrayList<>(); // list of parked cars
    private String garageName;

    public Garage(String garageName) {
        this.garageName = garageName;
    }

    public void addCar(Bil bil) {
        carPark.add(bil);
    }

    public double beregnGrønAfgiftForBilpark() {
        double afgift = 0;
        for (int i = 0; i < carPark.size(); i++) {
           afgift += carPark.get(i).beregnGrønEjerafgift();
        }
        return afgift;
    }

    public String formatOutput() {
        String carList = "";
        for (int i = 0; i < carPark.size(); i++) {
           carList += carPark.get(i).mærke + " " + carPark.get(i).model + ": Reg " + carPark.get(i).regNr + "\n";
        }
        return carList;
    }

    @Override
    public String toString() {
        return garageName +
                " har disse biler:\n" + formatOutput() +
                "\nDen samlede afgift er: " + beregnGrønAfgiftForBilpark() + " kr.";
    }
}
