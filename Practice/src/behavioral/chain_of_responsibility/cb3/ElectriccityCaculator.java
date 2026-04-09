package behavioral.chain_of_responsibility.cb3;

abstract class ElectriccityCaculator {
    protected ElectriccityCaculator nextCalculator;

    public ElectriccityCaculator setNextCalculator(ElectriccityCaculator nextCalculator) {
        this.nextCalculator = nextCalculator;
        return this.nextCalculator;
    }

    public abstract double calculateBill(int kwh);
}
