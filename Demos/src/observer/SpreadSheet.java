package observer;

public class SpreadSheet implements Observer {

    private Datasource datasource;

    public SpreadSheet(Datasource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet updated based on new value: " + datasource.getValue());
    }
}
