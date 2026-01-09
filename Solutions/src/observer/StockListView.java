package observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║          STOCK LIST            ║");
        System.out.println("╠════════════════════════════════╣");

        for (var stock : stocks) {
            String symbol = stock.getSymbol();
            String price = String.format("%.2f", stock.getPrice());

            // Adjust spacing to keep columns aligned
            System.out.printf("║ %-10s : $%7s          ║%n", symbol, price);
        }

        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void update() {
        System.out.println("A stock in the Stock List has changed price. Refreshing...");
        show();
        System.out.println();
    }
}
