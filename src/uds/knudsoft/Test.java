// This is as far as I got so far (

package uds.knudsoft;

public class Test {

    public static void main(String[] args) {
        Garage garage = new Garage("Multi storey");
        Benzinebil bil1 = new Benzinebil("AA 11 111", "Ford", "Focus", 2012, 5, 95, 28.5);
        Dieselbil bil2 = new Dieselbil("BB 22 222", "Ford", "Focus", 2014, 4, true, 33.8);
        Elbil bil3 = new Elbil("CC 33 333", "Peugeot", "E-208", 2020, 3, 22, 350, 0.25);

        System.out.println(bil1);
        garage.addCar(bil1);
        System.out.println("afgift for reg: " + bil1.regNr + " er: " + bil1.beregnGrønEjerafgift() + " kr.");

        System.out.println(bil2);
        garage.addCar(bil2);
        System.out.println("afgift for reg: " + bil2.regNr + " er: " + bil2.beregnGrønEjerafgift() + " kr.");

        System.out.println(bil3);
        garage.addCar(bil3);
        System.out.println("afgift for reg: " + bil3.regNr + " er: " + bil3.beregnGrønEjerafgift() + " kr.");

        System.out.println("\n" + garage);
        System.out.println("total afgift for garagen er: " + garage.beregnGrønAfgiftForBilpark() + " kr.");

    }
}
