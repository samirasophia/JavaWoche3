package Recap2;

import java.util.List;
import java.util.Scanner;

public class OrderMapRepo implements OrderRepo {

    @Override
    public void addProduct(Product product) {
        orders.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        orders.remove(product);
    }

    @Override
    public List<Order> getProducts() {
        return orders;
    }

    @Override
    public void makeOrder(Order order, ProductRepo list, OrderListRepo list2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was wollen Sie bestellen?");
        String nameOfProd = sc.nextLine();
        for (Product product : list.getProducts()) {
            if (product.name().equalsIgnoreCase(nameOfProd)) {
                System.out.println("Bestellung wurde versandt.");
                list2.addProduct((product));
            } else {
                System.out.println("invalid");
            }
        }
    }
}
