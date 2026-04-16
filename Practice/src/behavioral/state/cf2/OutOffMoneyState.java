package behavioral.state.cf2;

public class OutOffMoneyState extends ATMState{
    @Override
    public void withdraw(ATMMachine context, int amount) {
        System.out.println("TU CHOI: Xin loi quy khach. May ATM hien tai dang het tien");
    }
}
