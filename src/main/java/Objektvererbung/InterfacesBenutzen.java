package Objektvererbung;

import Objektvererbung.Interfaces.Playable;

public class InterfacesBenutzen {
    public static void main(String[] args) {
        MediaController mouse = new MediaController();
        mouse.setName("Maus");
        mouse.playMedia();
        MusicPlayer handy = new MusicPlayer();
        handy.setName("Handy");
        handy.playMusic();
    }
    }