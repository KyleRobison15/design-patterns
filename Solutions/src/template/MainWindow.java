package template;

public class MainWindow extends Window{
    @Override
    protected void beforeClosing(){
        System.out.println("*************** CLOSING MAIN WINDOW **************");
        System.out.println("Closing Database Connections...");
    }

    @Override
    protected void afterClosing() {
        System.out.println("Terminating app...");
    }
}
