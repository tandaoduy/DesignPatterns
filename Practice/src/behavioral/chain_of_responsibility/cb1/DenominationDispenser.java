package behavioral.chain_of_responsibility.cb1;

public class DenominationDispenser extends MoneyDispenser{
    private int denomination;

    public DenominationDispenser(int denomination) {
        this.denomination = denomination;
    }

    @Override
    public void Dispense(int amount) {
        if (amount >= denomination){
            int count = amount / denomination;
            int remainder = amount % denomination;
            System.out.println(count + " to menh gia " + denomination);

            if (remainder != 0 && nextDispenser != null){
                nextDispenser.Dispense(remainder);
            } else if (remainder != 0) {
                System.out.println("Loi: Khong the chi tra so tien con lai " + remainder);
            }
        } else if (nextDispenser != null) {
            nextDispenser.Dispense(amount);

        }
    }
}
