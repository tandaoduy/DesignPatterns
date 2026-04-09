package behavioral.chain_of_responsibility.cb3;

public class MainCb3 {
    public static void main(String[] args) {
        ElectriccityCaculator bac1 = new TierCaculator("Bac 1 (0- 50 kwh)", 50, 1806);
        ElectriccityCaculator bac2 = new TierCaculator("Bac 2 (51- 100 kwh)", 50, 1866);
        ElectriccityCaculator bac3 = new TierCaculator("Bac 3 (101- 200 kwh)", 100, 2167);
        ElectriccityCaculator bac4 = new TierCaculator("Bac 4 (201- 300 kwh)", 100, 2729);
        ElectriccityCaculator bac5 = new TierCaculator("Bac 5 (301- 400 kwh)", 100, 3050);
        ElectriccityCaculator bac6= new TierCaculator("Bac 6 (401 tro len)", Integer.MAX_VALUE, 3151);

        bac1.setNextCalculator(bac2)
                .setNextCalculator(bac3)
                .setNextCalculator(bac4)
                .setNextCalculator(bac5)
                .setNextCalculator(bac6);

        testCaculatorBill(bac1, 45);
        testCaculatorBill(bac1, 120);
        testCaculatorBill(bac1, 450);

    }
    private static void testCaculatorBill(ElectriccityCaculator chainHead, int kwh){
        System.out.println("Hoa don danh cho gia dinh dung " + kwh + " kwh");
        double totalBill = chainHead.calculateBill(kwh);
        System.out.println("TONG TIEN: " + totalBill + "VND");

    }
}
