package behavioral.state.cf2;

public class LimitedState extends ATMState{
    @Override
    public void withdraw(ATMMachine context, int amount) {
        if (amount > context.getCashInMachine()){
            System.out.println("LOI: May hien tai khong du tiem mat. Chi co the riut toi da duoc " + context.getCashInMachine() + " VND");
            return;
        }
        System.out.println("THANH CONG: Dang rut so tien " + amount + "VND");
        context.setCashInMachine(context.getCashInMachine() - amount);
        System.out.println("-> So du hien tai cua may la: " + context.getCashInMachine() + " VND");
        if (context.getCashInMachine() == 0){
            context.setState(new OutOffMoneyState());
            System.out.println("[HE THONG] MAY ATM DA CHUYEN SANG TRANG THAI HET TIEN");
        }
    }
}
