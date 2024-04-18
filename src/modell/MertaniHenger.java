package modell;

public class MertaniHenger {
    private static int hengerDb = 0;
    private double sugar, magassag;

    public static int getHengerDb() {
        return hengerDb;
    }
    
    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDb++;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat(){
        return Math.pow(sugar, 2) * Math.PI;
    }
    
    @Override
    public String toString() {
        return "MertaniHenger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
}
