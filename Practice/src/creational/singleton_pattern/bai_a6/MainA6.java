package creational.singleton.bai_a6;

public class MainA6 {
    public static void main(String[] args) {
        DataAccess ui1 = DataAccess.getInstance();
        DataAccess ui2 = DataAccess.getInstance();
        DataAccess ui3 = DataAccess.getInstance();

        ui1.add(new SanPham("01", "Mứt Dừa", 50000, 10));
        ui2.add(new SanPham("02", "Mứt Gừng", 50000, 10));
        ui3.add(new SanPham("03", "Bánh chưng", 50000, 10));

        ui1.inDS();
        ui2.inDS();
        ui3.inDS();

    }
}
