package behavioral.strategy.example;

public class MainPayment {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new MomoPaymet());
        cart.checkout(5000000);
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(5000000);
    }
}
