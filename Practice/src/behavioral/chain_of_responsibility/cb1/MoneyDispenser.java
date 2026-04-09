package behavioral.chain_of_responsibility.cb1;

abstract class MoneyDispenser {
    protected MoneyDispenser nextDispenser;

    public MoneyDispenser setNextDispenser(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
        return this.nextDispenser;
    }

    public abstract void Dispense(int amount);
}
