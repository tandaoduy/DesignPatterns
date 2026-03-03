package structural.decorator.beverage;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast("Cà phê Trung Nguyên");
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Milk("Cô gái Hà Lan",beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Milk("Sữa ông thọ", beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
