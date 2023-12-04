package Recap2;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List orders = new ArrayList<>();


    //add
    public void addProduct(Product product) {
        orders.add(product);
    }

    //remove
    public void removeProduct(Product product) {
        orders.remove(product);
    }

    //get
    public List<Order> getProducts() {
        return orders;
    }
}
