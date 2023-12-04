package Recap2;

import java.util.Scanner;

public class ShopService extends ProductRepo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;


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


