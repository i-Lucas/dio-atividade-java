package iphone;

import musicplayer.MusicPlayer;
import telephone.Telephone;
import webbrowser.WebBrowser;

public class Iphone implements MusicPlayer, Telephone, WebBrowser {

    public void startIphone() {

        displayPage();
        addNewTab();
        refreshPage();
        call();
        answerCall();
        voiceMail();
        playMusic();
        pauseMusic();
        selectMusic();

        System.out.println("[Iphone Start] StartIphone");
    }

    @Override
    public void displayPage() {
        System.out.println("[Iphone Browser] DisplayPage");
    }

    @Override
    public void addNewTab() {
        System.out.println("[Iphone Browser] AddNewTab");
    }

    @Override
    public void refreshPage() {
        System.out.println("[Iphone Browser] RefreshPage");
    }

    @Override
    public void call() {
        System.out.println("[Iphone Telephone] Call");
    }

    @Override
    public void answerCall() {
        System.out.println("[Iphone Telephone] AnswerCall");
    }

    @Override
    public void voiceMail() {
        System.out.println("[Iphone Telephone] VoiceMail");
    }

    @Override
    public void playMusic() {
        System.out.println("[Iphone MusicPlayer] PlayMusic");
    }

    @Override
    public void pauseMusic() {
        System.out.println("[Iphone MusicPlayer] PauseMusic");
    }

    @Override
    public void selectMusic() {
        System.out.println("[Iphone MusicPlayer] SelectMusic");
    }
}
