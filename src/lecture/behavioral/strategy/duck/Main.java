package lecture.behavioral.strategy.duck;

public class Main {
    public static void main(String[] args) {
        Duck d = new VitGioi();
        d.setFlyBehavior(new flyWithWings());
        d.setQuackBehavior(new Squack());
        d.display();
    }
}
