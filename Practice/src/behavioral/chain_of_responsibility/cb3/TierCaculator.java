package behavioral.chain_of_responsibility.cb3;

public class TierCaculator extends ElectriccityCaculator{
    private String tenBac;
    private int sucChua, donGia;

    public TierCaculator(String tenBac, int sucChua, int donGia) {
        this.tenBac = tenBac;
        this.sucChua = sucChua;
        this.donGia = donGia;
    }

    @Override
    public double calculateBill(int kwh) {
        if(kwh <= 0)    return  0;
        int kwhToProcess = Math.min(kwh, sucChua);
        double cost = kwhToProcess * donGia;
        System.out.println(tenBac + "tinh tien" + kwhToProcess + "kWh "+ donGia+ " = " + cost + " VND");
        int remainingkWh = kwh - kwhToProcess;
        if (remainingkWh > 0 && nextCalculator != null){
            cost += nextCalculator.calculateBill(remainingkWh);
        }
        return cost;

    }
}
