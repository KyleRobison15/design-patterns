package strategy;

public class ChatClient {
    private Cipher cipher;

    public ChatClient() {
        this.cipher = new AesCipher();
    }

    public void send(String message) {
        var encryptedMessage = cipher.encrypt(message);
        System.out.println("Encrypted Message: " + encryptedMessage);
    }

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
    }
}
