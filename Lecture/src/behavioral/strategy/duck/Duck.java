package behavioral.strategy.duck;

abstract public class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public abstract void display();

    public void swim(){
        System.out.println("Vo dich Olympic boi");
    }

    public void performFly(){
        System.out.println(flyBehavior.fly());
    }

    public void  performQuack(){
        System.out.println(quackBehavior.squack());;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
