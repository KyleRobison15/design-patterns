package observer;

public class Demo {
    public static void show(){

        var qqq = new Stock("QQQ", 627.22f);
        var spy = new Stock("SPY", 694.37f);
        var nvda = new Stock("NVDA", 185.05f);
        var amzn = new Stock("AMZN", 247.68f);
        var goog =  new Stock("GOOG", 329.91f);
        var aapl = new Stock("AAPL", 259.22f);

        var statusBar = new StatusBar();
        statusBar.addStock(qqq);
        statusBar.addStock(spy);
        statusBar.addStock(nvda);

        var stockList = new StockListView();
        stockList.addStock(qqq);
        stockList.addStock(spy);
        stockList.addStock(nvda);
        stockList.addStock(amzn);
        stockList.addStock(goog);
        stockList.addStock(aapl);

        System.out.println("================== INITIAL VIEWS ===================");
        statusBar.show();
        stockList.show();

        // This should result in StockListView being printed with the new price of AMZN
        amzn.setPrice(235.50f);

        // This should result in StatusBar AND StockListView being printed with the new price of QQQ
        qqq.setPrice(630.00f);

    }
}
