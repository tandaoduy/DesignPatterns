package OnTap.composite.Menu;

public abstract class AbstractMenu {
    protected String name;
    protected String prefix = "";

    public AbstractMenu(String name) {
        this.name = name;
    }

    public abstract String getStringTreeMenu();
    public abstract int getPrice();
    public abstract void addDish(AbstractMenu menu);
}
