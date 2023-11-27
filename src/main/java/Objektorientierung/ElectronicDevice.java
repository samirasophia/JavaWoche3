package Objektorientierung;

public class ElectronicDevice {
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public int getEnergyConsumptionWatt() {
        return energyConsumptionWatt;
    }

    public void setEnergyConsumptionWatt(int energyConsumptionWatt) {
        this.energyConsumptionWatt = energyConsumptionWatt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int energyConsumptionWatt;
    private String name;


}
