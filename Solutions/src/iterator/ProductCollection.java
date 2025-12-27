package iterator;

//import java.util.ArrayList;
//import java.util.List;

import java.util.ArrayList;
import java.util.List;

// Concrete Aggregate
public class ProductCollection {
  private List<Product> products = new ArrayList<>();
//    private Product[] products = new Product[10];
//    private int count;

  public Iterator<Product> createIterator() {
      return new ProductListIterator(products);
//      return new ProductArrayIterator(products);
  }

  public void add(Product product) {
      products.add(product);
//    products[count] = product;
//    count++;
  }

}
