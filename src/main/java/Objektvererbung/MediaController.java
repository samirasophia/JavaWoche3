package Objektvererbung;

import Objektvererbung.Interfaces.Playable;

public class MediaController extends VideoPlayer implements Playable {

    public void playMedia() {
        System.out.println("spiel Video und Musik ab");
}}
