package behavioral.chain_of_responsibility.cb1;

public class MainCb1 {
    public static void main(String[] args) {
        int amountToWithdraw = 293;
        System.out.println("--Cau a: Rut tien thong thuong (Mac dinh menh gia lon nhat la 500--");
        MoneyDispenser defaultChain = ATM_Machine.getDispenserChain(500);
        defaultChain.Dispense(amountToWithdraw);

        System.out.println("--Cau b: Rut tien voi menh gia lon nhat duoc chon la 50--");
        MoneyDispenser customChain = ATM_Machine.getDispenserChain(50);
        customChain.Dispense(amountToWithdraw);
    }
}
