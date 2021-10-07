package uds.knudsoft;

public class Benzinebil extends Bil {

    int oktantal;
    double kmPr;

    public Benzinebil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPr) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPr = kmPr;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double afgift = 330;
        if (kmPr < 20) {
            afgift = 1050;
        }
        if (kmPr < 15) {
            afgift = 2340;
        }
        if (kmPr < 10) {
            afgift = 5500;
        }
        if (kmPr < 5) {
            afgift = 10470;
        }
        return afgift;
    }

    /*public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPr() {
        return kmPr;
    }

    public void setKmPr(int kmPr) {
        this.kmPr = kmPr;
    }*/

    @Override
    public String toString() {
        return "\nBil info:" +
                "\nMærke/Model: " + mærke + " " + model + ", " + antalDøre + "-døre " + årgang +
                "\nReg nummer: " + regNr +
                "\nMotor: Benzine, Oktanetal: " + oktantal +
                "\nKm/l: " + kmPr +
                "\nAfgift: " + beregnGrønEjerafgift() + " kr.";
    }
}
