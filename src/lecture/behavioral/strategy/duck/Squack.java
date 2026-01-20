package lecture.behavioral.strategy.duck;

public class Squack implements IQuackBehavior{
    @Override
    public String squack() {
        return "Quack...Quack";
    }
}
