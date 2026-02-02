package creational.factory.pizza.vietnam;
import creational.factory.pizza.Pizza;
public class HaiSanPizza extends Pizza {
    @Override
    public void prepare() {
        this.getBuilder().append("Bột mì, mắm tôm, 4 con cá cơm");
    }

    @Override
    public void bake() {
        this.getBuilder().append("\n Nướng trên lò than 30 phút");
    }

    @Override
    public void cut() {
        this.getBuilder().append("\n Cắt làm 4 miếng");
    }

    @Override
    public void box() {
        this.getBuilder().append("\n Bọc lá chuối");
    }
}
