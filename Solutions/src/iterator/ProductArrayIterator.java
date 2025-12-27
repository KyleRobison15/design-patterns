package iterator;

public class ProductArrayIterator implements Iterator<Product> {

    private Product[] products;
    private int index;

    public ProductArrayIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return (index < products.length && products[index] != null);
    }

    @Override
    public Product current() {
        return products[index];
    }

    @Override
    public void next() {
        index++;
    }
}
