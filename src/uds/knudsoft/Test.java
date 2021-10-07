// This is as far as I got so far (

package uds.knudsoft;

public class Test {

    public static void main(String[] args) {
    Benzinebil bil1 = new Benzinebil("AA11111", "Ford", "Focus", 2012 ,5, 95, 28.5);
        System.out.println(bil1);
        System.out.println("afgift: " + bil1.beregnGrønEjerafgift());
    }
}
