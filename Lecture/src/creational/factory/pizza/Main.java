package creational.factory.pizza;

import creational.factory.pizza.vietnam.VietNamPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new VietNamPizzaStore();
        Pizza p = store.orderPizza(PizzaType.BO);
        Pizza p1 = store.orderPizza(PizzaType.PHOMAI);
        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
}
