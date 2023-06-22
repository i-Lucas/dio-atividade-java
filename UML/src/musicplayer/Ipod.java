package musicplayer;

public class Ipod implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("[Ipod MusicPlayer] PlayMusic");
    }

    @Override
    public void pauseMusic() {
        System.out.println("[Ipod MusicPlayer] PauseMusic");
    }

    @Override
    public void selectMusic() {
        System.out.println("[Ipod MusicPlayer] SelectMusic");
    }
}