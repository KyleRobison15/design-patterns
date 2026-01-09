package observer;

public class Chart implements Observer {

    private Datasource datasource;

    public Chart(Datasource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("Chart has been updated based on new value: " + datasource.getValue());
    }
}
