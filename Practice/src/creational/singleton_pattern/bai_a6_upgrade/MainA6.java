package creational.singleton_pattern.bai_a6_upgrade;

public class MainA6 {
    public static void main(String[] args) {
        DataAccessUpgrade ui1 = DataAccessUpgrade.getInstance("tan");
        DataAccessUpgrade ui2 = DataAccessUpgrade.getInstance("duy");
        DataAccessUpgrade ui3 = DataAccessUpgrade.getInstance("tan");

        ui1.add(new SanPham("01", "Mứt Dừa", 50000, 10));
        ui2.add(new SanPham("02", "Mứt Gừng", 50000, 10));
        ui3.add(new SanPham("03", "Bánh chưng", 50000, 10));

        ui1.inDS();
        ui2.inDS();
        ui3.inDS();

    }
}
