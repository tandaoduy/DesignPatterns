package behavioral.strategy.example;

public class MomoPaymet implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + " bang Momo thanh cong");
    }
}
