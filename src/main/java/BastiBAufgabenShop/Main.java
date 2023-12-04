package BastiBAufgabenShop;


public class Main {
    public static void main(String[] args) {
        idk idk1 = erstelleProdukt("Produkt 1", 10.0, 5);
        idk idk2 = erstelleProdukt("Produkt 2", 8.0, 3);

        System.out.println(idk1.getName() + ": " + idk1.getPreis() + " Euro, " + idk1.getMenge() + " Stück");
        System.out.println(idk2.getName() + ": " + idk2.getPreis() + " Euro, " + idk2.getMenge() + " Stück");
    }

    public static idk erstelleProdukt(String name, double preis, int menge) {
        idk idk = new idk(name, preis, menge);
        return idk;
    }
}