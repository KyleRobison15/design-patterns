package observer;

public class Demo {
    public static void show(){
        var datasource = new Datasource();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        datasource.addObserver(sheet1);
        datasource.addObserver(sheet2);
        datasource.addObserver(chart);

        datasource.setValue(1);

    }
}
