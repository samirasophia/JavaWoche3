package BastiBAufgabenShop;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Builder
public class OnlineShop {
    private static List<idk> produktList = new ArrayList<>();

    public static void objektHinzufuegen(idk meow) {
        produktList.add(meow);
    }


    // Weitere Methoden und Eigenschaften...
}


