package OnTap.composite.Menu;

import java.util.ArrayList;
import java.util.List;

public class Combo extends AbstractMenu{
    List<AbstractMenu> dishs = new ArrayList<>();

    public Combo(String name) {
        super(name);
    }

    @Override
    public String getStringTreeMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.prefix).append(this.name).append(" [Tổng: ").append(this.getPrice()).append("đ]");
        for (var d: dishs){
            d.prefix = this.prefix +"\t";
            builder.append("\n").append(d.getStringTreeMenu());
            d.prefix = "";
        }
        return builder.toString();
    }

    @Override
    public int getPrice() {
        int total = 0;
        for (AbstractMenu d: dishs){
            total += d.getPrice();
        }
        return total;
    }

    @Override
    public void addDish(AbstractMenu menu) {
        dishs.add(menu);
    }
}
