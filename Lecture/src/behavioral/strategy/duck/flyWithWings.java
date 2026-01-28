package behavioral.strategy.duck;

public class flyWithWings implements IFlyBehavior{
    @Override
    public String fly() {
        return "Bay troi";
    }
}
