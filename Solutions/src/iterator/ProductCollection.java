package iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public Iterator<Product> createIterator() {
      return new ListIterator(this);
  }

  public void add(Product product) {
    products.add(product);
  }

  public class ListIterator implements Iterator<Product> {

      private ProductCollection collection;
      private int index;

      public ListIterator(ProductCollection collection) {
          this.collection = collection;
      }

      @Override
      public boolean hasNext() {
          return (index < collection.products.size());
      }

      @Override
      public Product current() {
          return collection.products.get(index);
      }

      @Override
      public void next() {
          index++;
      }
  }

}
