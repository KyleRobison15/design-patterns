package strategy;

public class DesCipher implements Cipher {
    @Override
    public String encrypt(String message) {
        return "***DES ENCRYPTED*** " + message + " ***DES ENCRYPTED***";
    }
}
