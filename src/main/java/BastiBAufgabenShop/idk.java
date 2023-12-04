package BastiBAufgabenShop;

public class idk {
    private String name;
    private double preis;
    private int menge;

    public idk(String name, double preis, int menge) {
        this.name = name;
        this.preis = preis;
        this.menge = menge;
    }

    // Getter und Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        if (menge >= 0) {
            this.menge = menge;
        } else {
            System.out.println("Die Menge darf nicht negativ sein.");
        }
    }
}
