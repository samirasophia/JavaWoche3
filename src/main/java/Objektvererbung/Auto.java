package Objektvererbung;

public class Auto extends Fahrzeug{
    public int getTüren() {
        return Türen;
    }

    public void setTüren(int türen) {
        Türen = türen;
    }

    int Türen;
}
