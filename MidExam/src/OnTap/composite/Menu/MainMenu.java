package OnTap.composite.Menu;

public class MainMenu {
    public static void main(String[] args) {
        // Tạo các món lẻ
        AbstractMenu gaRan = new Dish("Gà Rán", 45000);
        AbstractMenu khoaiTay = new Dish("Khoai Tây Chiên", 20000);
        AbstractMenu pepsi = new Dish("Pepsi", 15000);
        AbstractMenu burger = new Dish("Burger Bò", 55000);

        AbstractMenu c1  = new Combo("Combo 1");
        c1.addDish(gaRan);
        c1.addDish(khoaiTay);

        AbstractMenu c2 = new Combo("Combo");
        c2.addDish(c1);
        c2.addDish(pepsi);
        c2.addDish(burger);

        System.out.println(c2.getStringTreeMenu());
    }
}
