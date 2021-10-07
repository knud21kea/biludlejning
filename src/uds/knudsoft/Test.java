// Almost finished now

package uds.knudsoft;

public class Test {

    public static void main(String[] args) {
        Garage garage = new Garage("Citypark West");
        Benzinebil bil1 = new Benzinebil("AA 11 111", "Ford", "Focus", 2012, 5, 95, 28.5);
        Dieselbil bil2 = new Dieselbil("BB 22 222", "Ford", "Fiesta", 2014, 4, true, 33.8);
        Elbil bil3 = new Elbil("CC 33 333", "Peugeot", "E-208", 2020, 3, 22, 350, 0.25);
        //Dieselbil bil4 = new Dieselbil("DD 44 444", "Scania", "Streamline", 2009, 2, false, 8.2);

        System.out.println(bil1);
        garage.addCar(bil1);

        System.out.println(bil2);
        garage.addCar(bil2);

        System.out.println(bil3);
        garage.addCar(bil3);

        //System.out.println(bil4);
        //garage.addCar(bil4);

        System.out.println("\n" + garage); // not sure how much data here, outputting make, model and reg
        }
    }
