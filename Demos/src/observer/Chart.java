package observer;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart has been updated based on new value: " + value);
    }
}
