package strategy;

public class Demo {
    public static void show(){
        var chatClient = new ChatClient();

        chatClient.send("Hello Strategy Pattern!");

        chatClient.setCipher(new DesCipher());

        chatClient.send("Hello Strategy Pattern!");

    }
}
