package telephone;

public class Nokia implements Telephone {

    @Override
    public void call() {
        System.out.println("[Nokia Telephone] Call");
    }

    @Override
    public void answerCall() {
        System.out.println("[Nokia Telephone] AnswerCall");
    }

    @Override
    public void voiceMail() {
        System.out.println("[Nokia Telephone] VoiceMail");
    }
}
