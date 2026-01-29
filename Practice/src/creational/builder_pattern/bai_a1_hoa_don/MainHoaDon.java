package creational.builder_pattern.bai_a1_hoa_don;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .buildHeader("hd01", "29/01/2026", "Duy Tấn")
                .addCTHD("Me", 5, 50000, 0.1F)
                .addCTHD("Xoài", 3, 35000, 0.15F)
                .addCTHD("Mắm", 2, 35000, 0.15F)
                .addCTHD("Giấy VS", 20, 55000, 0.15F)
                .build();
        hd.inHD();
    }
}
