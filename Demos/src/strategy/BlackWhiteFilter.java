package strategy;

public class BlackWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Black and White filter to " + fileName);
    }
}
