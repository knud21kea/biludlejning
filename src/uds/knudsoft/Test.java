// This is as far as I got so far (

package uds.knudsoft;

public class Test {

    public static void main(String[] args) {
    Benzinebil bil1 = new Benzinebil("AA 11 111", "Ford", "Focus", 2012 ,5, 95, 28.5);
    Dieselbil bil2 = new Dieselbil("BB 22 222", "Ford", "Focus", 2014, 4, true, 33.8);
    Elbil bil3 = new Elbil("CC 33 333", "Peugeot", "E-208", 2020, 3, 22, 350, 0.25);
        System.out.println(bil1);
        System.out.println("afgift: " + bil1.beregnGrønEjerafgift());
        System.out.println(bil2);
        System.out.println("afgift: " + bil2.beregnGrønEjerafgift());
        System.out.println(bil3);
        System.out.println("afgift: " + bil3.beregnGrønEjerafgift());

    }
}
