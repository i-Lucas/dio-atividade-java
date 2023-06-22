package webbrowser;

public class Netscape implements WebBrowser {

    @Override
    public void displayPage() {
        System.out.println("[Netscape Browser] DisplayPage");
    }

    @Override
    public void addNewTab() {
        System.out.println("[Netscape Browser] AddNewTab");
    }

    @Override
    public void refreshPage() {
        System.out.println("[Netscape Browser] RefreshPage");
    }
}
