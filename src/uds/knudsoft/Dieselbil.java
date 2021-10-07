package uds.knudsoft;

public class Dieselbil extends Bil {

    boolean harPartikelfilter;
    double kmPr;

    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPr) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPr = kmPr;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double afgift = 330 + 130; // Benzinebil + udligningsafgift
        if (kmPr < 20) {
            afgift = 1050 + 1390;
        }
        if (kmPr < 15) {
            afgift = 2340 + 1850;
        }
        if (kmPr < 10) {
            afgift = 5500 + 2770;
        }
        if (kmPr < 5) {
            afgift = 10470 + 15260;
        }
        if (!harPartikelfilter) {
            afgift += 1000; // partikeludledningsafgift
        }
        return afgift;
    }

    /*public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPr() {
        return kmPr;
    }

    public void setKmPr(int kmPr) {
        this.kmPr = kmPr;
    }*/

    @Override
    public String toString() {
        return "Diesel bil [" +
                " reg: " + regNr +
                ", mærke: " + mærke +
                ", model: " + model +
                ", årgang: " + årgang +
                ", antal døre: " + antalDøre +
                ", har partikel filter: " + harPartikelfilter +
                ", kmPr: " + kmPr +
                ']';
    }
}