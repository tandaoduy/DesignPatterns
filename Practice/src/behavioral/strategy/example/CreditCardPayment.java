package behavioral.strategy.example;

public class CreditCardPayment implements IPaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + " bang Credit card thanh cong");
    }
}
