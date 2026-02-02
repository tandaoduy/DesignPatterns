package creational.factory.pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type){
        var pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

}
