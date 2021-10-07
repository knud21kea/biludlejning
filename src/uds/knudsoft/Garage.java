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
        StringBuilder carList = new StringBuilder();
        for (int i = 0; i < carPark.size(); i++) {
           carList.append(carPark.get(i).mærke).append(" ").append(carPark.get(i).model).append(": Reg ").append(carPark.get(i).regNr).append("\n");
        }
        return carList.toString();
    }

    @Override
    public String toString() {
        return garageName +
                " har disse biler:\n" + formatOutput() +
                "\nDen samlede afgift er: " + beregnGrønAfgiftForBilpark() + " kr.";
    }
}
