package structural.decorator.beverage;
//khônhg muốn sd ở lớp này mà sử dụng ở decorator
public abstract class CondimentDecorator extends Beverage {
     Beverage beverage;

    public CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int cost() {
        return beverage.cost();
    }
}
