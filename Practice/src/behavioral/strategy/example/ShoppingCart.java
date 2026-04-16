package behavioral.strategy.example;

public class ShoppingCart {
    private IPaymentStrategy paymentStrategy;
    public void setPaymentStrategy(IPaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    //uỷ quyền cho stragery
    public void checkout(double amount){
        paymentStrategy.pay(amount);
    }

}
