import iphone.Iphone;
import musicplayer.Ipod;
import telephone.Nokia;
import webbrowser.Netscape;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.startIphone();

        Netscape netscape = new Netscape();
        netscape.addNewTab();
        netscape.displayPage();
        netscape.refreshPage();

        Nokia nokia = new Nokia();
        nokia.answerCall();
        nokia.call();
        nokia.voiceMail();

        Ipod ipod = new Ipod();
        ipod.selectMusic();
        ipod.playMusic();
        ipod.pauseMusic();
    }
}