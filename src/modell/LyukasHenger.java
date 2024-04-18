package modell;

public class LyukasHenger extends TomorHenger{
    private double falvast;

    public LyukasHenger(double sugar, double magassag, double falvast) {
        this(sugar, magassag, 1, falvast);
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvast) {
        super(sugar, magassag, fajsuly);
        this.falvast = falvast;
    }

    public double getFalvast() {
        return falvast;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n    MH<|--TH<|--"
                +"LyukasHenger{" + "falvast=" + falvast + '}';
    }

    @Override
    public double terfogat() {
        return super.terfogat();
    }

    
}
