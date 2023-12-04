package BastiBAufgabenShop;

import java.util.ArrayList;

public class Shop {
    public ArrayList getProdukte() {
        return produkte;
    }

    public void setProdukte(ArrayList produkte) {
        this.produkte = produkte;
    }

    public ArrayList getKunden() {
        return kunden;
    }

    public void setKunden(ArrayList kunden) {
        this.kunden = kunden;
    }

    private ArrayList produkte;
    private ArrayList kunden;

    public void OnlineShop() {
        this.produkte = new ArrayList<>();
        this.kunden = new ArrayList<>();
    }


}



