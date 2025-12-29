package strategy;

public class AesCipher implements Cipher {
    @Override
    public String encrypt(String message) {
        return "***AES ENCRYPTED*** " + message + " ***AES ENCRYPTED***";
    }
}
