package behavioral.state.cf2;

public class MainATM {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine(7000000);
        atm.withdrawal(3000000);
        atm.withdrawal(5000000);
        atm.withdrawal(4000000);
        atm.withdrawal(500000);
    }
}
