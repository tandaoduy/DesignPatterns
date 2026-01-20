package lecture.behavioral.strategy.duck;

public class VitGioi extends Duck {
    @Override
    public void display() {
        System.out.println("Em la vit gioi dang yeu");
        performFly();
        performQuack();
        swim();
        System.out.println("Ngay mai");
    }
}
