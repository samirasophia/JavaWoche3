package Objektvererbung;

public class Motorrad extends Fahrzeug{
    public int getTires() {
        return Tires;
    }

    public void setTires(int tires) {
        Tires = tires;
    }

    public String getArt() {
        return Art;
    }

    public void setArt(String art) {
        Art = art;
    }

    int Tires;
    String Art;
}
