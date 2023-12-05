package DjBastiBBonusAufgabenList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        //Alles erstellen
        ArrayList<String> unoKarten = erstelleUnoKarten();
        System.out.println(unoKarten);
        System.out.println("Anzahl der Karten: " + unoKarten.size());
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> stapel = new ArrayList<>();

        kartenAusteilen(player1, player2, unoKarten);
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);
        boolean end = false;
        while (end == false) {
            player1move(player1, stapel);
            System.out.println(stapel);
            System.out.println("Player 1: " + player1);
            System.out.println("Player 2: " + player2);
            for (String meow : player2
            ) {
                if (stapel.getLast().equalsIgnoreCase(meow.toLowerCase())) {

                }
            }
        }


    }

    private static void player1move(ArrayList<String> player1, ArrayList stapel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player1, welche Karte spielst du!");
        String karte = sc.nextLine();
        for (String rawr : player1
        ) {
            if (rawr.equalsIgnoreCase(karte)) {
                stapel.add(rawr);
                player1.remove(rawr);
                System.out.println("Player 1: " + player1);
                break;
            }

        }
    }

    public static void kartenHinzufügen(int x, ArrayList player, ArrayList unoKarten) {
        Collections.shuffle(unoKarten);
        for (int i = 0; i < x; i++) {
            while (player.contains(unoKarten.get(i))) {
                Collections.shuffle(unoKarten);
            }
            player.add(unoKarten.get(i));
        }
    }

    public static void kartenAusteilen(ArrayList player1, ArrayList player2, ArrayList unoKarten) {
        Collections.shuffle(unoKarten);
        for (int i = 0; i < 7; i++) {
            while (player1.contains(unoKarten.get(i))) {
                Collections.shuffle(unoKarten);
            }
            player1.add(unoKarten.get(i));
            unoKarten.remove(i);
            while (player2.contains(unoKarten.get(i))) {
                Collections.shuffle(unoKarten);
            }
            player2.add(unoKarten.get(i));
            unoKarten.remove(i);
        }
    }//Methode zum Karten machen

    public static ArrayList<String> erstelleUnoKarten() {
        ArrayList<String> unoKartenSet = new ArrayList<>();

        String[] farben = {"Rot", "Blau", "Violet", "Gelb"};
        String[] werte = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Aussetzen", "Richtungswechsel", "+2"};

        for (String farbe : farben) {
            unoKartenSet.add(farbe + " 0"); // Eine Karte der Wert 0 für jede Farbe

            for (int i = 1; i < werte.length; i++) {
                unoKartenSet.add(farbe + " " + werte[i]); // Eine Karte für jeden Wert außer 0
                unoKartenSet.add(farbe + " " + werte[i]); // Doppelte Karte für jeden Wert außer 0
            }

            // Spezielle "Aussetzen", "Richtungswechsel" und "+2" Karten für jede Farbe
            unoKartenSet.add(farbe + " Aussetzen");
            unoKartenSet.add(farbe + " Aussetzen");
            unoKartenSet.add(farbe + " Richtungswechsel");
            unoKartenSet.add(farbe + " Richtungswechsel");
            unoKartenSet.add(farbe + " +2");
            unoKartenSet.add(farbe + " +2");
        }

        // Farbwechsel-Karten
        unoKartenSet.add("Farbwechsel");
        unoKartenSet.add("Farbwechsel");
        unoKartenSet.add("Farbwechsel +4");
        unoKartenSet.add("Farbwechsel +4");

        return unoKartenSet;
    }
}
