package Objektvererbung;

public class media {
    public static void main(String[] args) {
        MediaController start = new MediaController();

        MusicPlayer music = new MusicPlayer();

        start.playMedia(music);

        VideoPlayer video = new VideoPlayer();
        start.playMedia(video);
    }
}
