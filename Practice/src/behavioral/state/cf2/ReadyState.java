package behavioral.state.cf2;

public class ReadyState extends ATMState{
    @Override
    public void withdraw(ATMMachine context, int amount) {
        if (amount > context.getCashInMachine()){
            System.out.println("LOI: Vuot qua han muc cho phep duoc rut toi da (" + context.getMaxWithdrawal() + "VND / lan");
            return;
        }
        System.out.println("THANH CONG: Dang rut tien " + amount + " VND");
        context.setCashInMachine(context.getCashInMachine() - amount);
        System.out.println("-> So du hien tai cua may ATM con: " + context.getCashInMachine() + " VND");

        if (context.getCashInMachine() == 0){
            context.setState(new OutOffMoneyState());
            System.out.println("[HE THONG] MAY ATM DA CHUYEN SANG TRANG THAI HET TIEN");

        } else if (context.getCashInMachine() < context.getMaxWithdrawal()) {
            context.setState(new LimitedState());
            System.out.println("[HE THONG] MAY ATM DA CHUYEN SANG TRANG THAI HAN CHE");
        }
    }
}
