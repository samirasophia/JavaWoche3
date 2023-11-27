package Objektorientierung;

public class Fahrzeug {
    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public String getModell() {
        return Modell;
    }

    public void setModell(String modell) {
        Modell = modell;
    }

    public int getBaujahr() {
        return Baujahr;
    }

    public void setBaujahr(int baujahr) {
        Baujahr = baujahr;
    }

    String Hersteller;
    String Modell;
    int Baujahr;

    public void printData(){
        System.out.println(Baujahr);
    }
}

