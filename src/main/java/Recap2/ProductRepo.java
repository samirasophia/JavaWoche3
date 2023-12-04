package Recap2;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List products = new ArrayList<>();


    //add
    public void addProduct(Product product) {
        products.add(product);
    }

    //remove
    public void removeProduct(Product product) {
        products.remove(product);
    }

    //get
    public List<Product> getProducts() {
        return products;

    }


}


