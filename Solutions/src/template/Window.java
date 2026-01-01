package template;

public class Window {

    // This close method is the TEMPLATE METHOD ->
    //      Defines what behavior should occur before and after the window is closed
    public void close() {

        beforeClosing();

        System.out.println("Removing the window from the screen...");

        afterClosing();

    }

    protected void beforeClosing(){};

    protected void afterClosing(){};
}
