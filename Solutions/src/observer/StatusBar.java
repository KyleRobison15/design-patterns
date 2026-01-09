package observer;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (int i = 0; i < stocks.size(); i++) {
            var stock = stocks.get(i);
            String symbol = stock.getSymbol();
            String price = String.format("%.2f", stock.getPrice());

            // Print each stock in the format SYMBOL $PRICE
            System.out.print(symbol + " $" + price);

            // Add separator except after the last stock
            if (i < stocks.size() - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println(); // move to next line after all stocks
    }

    @Override
    public void update() {
        System.out.println("A stock in the status bar has changed price. Refreshing...");
        show();
        System.out.println();
    }
}
