package observer;

public class SpreadSheet implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Spreadsheet updated based on new value: " + value);
    }
}
