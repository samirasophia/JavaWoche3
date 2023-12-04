package Recap2;

public class usage {
    public static void main(String[] args) {

        ProductRepo ListProd = new ProductRepo();
        OrderListRepo ListOrder = new OrderListRepo();
        ShopService coop = new ShopService();
        coop.setName("Coop");
        Product meow = new Product("Cat", 404, true, "404cat");
        Order order1 = new Order("meowstrasse 123", true);
        Order order2 = new Order("meowstrasse 123", true);

        ListProd.addProduct(meow);
        coop.makeOrder(order1, ListProd, ListOrder);
        System.out.println(ListOrder);

        //OrderMapRepo

        OrderMapRepo MapRepo = new OrderMapRepo();
        MapRepo.getProducts();
        MapRepo.makeOrder(order2, ListProd, ListOrder);
    }
}
