package Objektorientierung;

public class Einführung {
    public static void main(String[] args) {
ElectronicDevice mouse = new ElectronicDevice();
mouse.setPrice(8790.90);
mouse.setEnergyConsumptionWatt(49);
mouse.setName("Mx Master");


ElectronicDevice keyboard = new ElectronicDevice();
    keyboard.setName("Mx");
    keyboard.setPrice(78.99);
    keyboard.setEnergyConsumptionWatt(33);

    Screen smartTv = new Screen();
    smartTv.setPrice(888.88);
    smartTv.setName("OLed Fernseher");
    smartTv.setEnergyConsumptionWatt(80);
    smartTv.setResolutionX(1990);
    smartTv.setResolutionY(2100);
    smartTv.setInch(55);

    printElectronicDevice(smartTv);

    Auto bmw = new Auto();
    bmw.setTüren(4);
    bmw.setBaujahr(999);
    bmw.setHersteller("BMW");
    bmw.setModell("Kei ahnig");
    printAuto(bmw);
    Motorrad kawaski = new Motorrad();
    kawaski.setArt("Kawaski halt");
    kawaski.setTires(2);
    kawaski.setModell("Kawaski man");
    printMotorrad(kawaski);
    bmw.printData();
    }

    public static void printElectronicDevice(ElectronicDevice a){
        System.out.println(a);
    }
    public static void printAuto (Auto a){
        System.out.println(a);
        System.out.println(a.Hersteller);
        System.out.println("Türen = " + a.Türen);
        System.out.println(a.getBaujahr());
    }
    public static void printMotorrad(Motorrad a){
        System.out.println(a.Art);
    }
    public static void printFahrzeug(Fahrzeug a){

    }
}
