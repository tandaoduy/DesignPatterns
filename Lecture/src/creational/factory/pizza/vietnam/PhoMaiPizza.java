package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class PhoMaiPizza extends Pizza {
    @Override
    public void prepare() {
        this.getBuilder().append("Phô Mai, thịt gà, cà chua");
    }

    @Override
    public void bake() {
        this.getBuilder().append("\nNướng trên 15 phút");
    }

    @Override
    public void cut() {
        this.getBuilder().append("\n Cắt là 8 miếng");
    }

    @Override
    public void box() {
        this.getBuilder().append("Bỏ trong hộp vuông");
    }
}
