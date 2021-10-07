package uds.knudsoft;

public abstract class Bil {

    String regNr, mærke, model;
    int årgang, antalDøre;

    public Bil (String regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    abstract double beregnGrønEjerafgift();
}
