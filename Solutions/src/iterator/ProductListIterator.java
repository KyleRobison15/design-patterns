package iterator;

import java.util.List;

// Concrete Iterator
public class ProductListIterator implements Iterator<Product> {

    private List<Product> products;
    private int index;

    public ProductListIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return (index < products.size());
    }

    @Override
    public Product current() {
        return products.get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
