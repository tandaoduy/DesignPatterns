package OnTap.composite.Menu;

public class Dish extends AbstractMenu {
    int price;

    public Dish(String name, int price) {
        super(name);
        this.price=price;
    }

    @Override
    public String getStringTreeMenu() {
        return this.prefix + this.name + " (" + getPrice() + "đ)";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void addDish(AbstractMenu menu) {

    }
}
