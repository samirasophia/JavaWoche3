package Recap2;

import java.util.ArrayList;
import java.util.List;

public interface OrderRepo {
    List orders = new ArrayList<>();

    //add
    public void addProduct(Product product);


    //remove
    public void removeProduct(Product product);


    //get
    public List<Order> getProducts();

    //make order
    public void makeOrder(Order order, ProductRepo list, OrderListRepo list2);
}
