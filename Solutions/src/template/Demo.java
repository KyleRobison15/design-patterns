package template;

public class Demo {
    public static void show(){
        var mainWindow = new MainWindow();
        var chatWindow = new ChatWindow();

        chatWindow.close();
        mainWindow.close();
    }
}
