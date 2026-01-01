package template;

public class ChatWindow extends Window {

    @Override
    protected void beforeClosing() {
        System.out.println("*************** CLOSING CHAT WINDOW **************");
        System.out.println("Disconnecting from Chat Server...");
    }

}
