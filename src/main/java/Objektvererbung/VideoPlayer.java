package Objektvererbung;

import Objektvererbung.Interfaces.Playable;

public class VideoPlayer implements Playable {
    public void play() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public void videoPlayer() {
        System.out.println("spielt video ab");
}

    @Override
    public void print() {

    }
}
