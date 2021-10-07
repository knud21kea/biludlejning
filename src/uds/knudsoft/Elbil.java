package uds.knudsoft;

public class Elbil extends Bil {

    double batterikapacitetKWh, maxKm, whPrKm;

    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double afgift = 330;
        double kmPr = 100/(whPrKm/91.25);
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

    public double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
}