package iterator;

public class Demo {
    public static void show(){
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Revel Rascal"));
        productCollection.add(new Product(2, "Orbea Oiz"));
        productCollection.add(new Product(3, "Canyon Neuron"));


        /*
        * Iterate over the product collection and print the products
        *
        * Naive approach -> get the products from the product collection and use a for loop to print each product
        *   - The problem with this approach is if tomorrow we change the ProductCollection to a fixed size array, our code with break!
        *   - This is a big issue if we are iterating over the product collection in many places in our application!
        *
        * Optimized Approach -> Use the iterator pattern!
        *
        */

        var iterator = productCollection.createIterator();

        while (iterator.hasNext()) {
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }

    }
}
