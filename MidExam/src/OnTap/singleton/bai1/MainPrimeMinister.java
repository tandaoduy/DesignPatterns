package OnTap.singleton.bai1;

public class MainPrimeMinister {
    public static void main(String[] args) {
        PrimeMinister pm = PrimeMinister.getInstance();
        pm.setTen("Lê Minh Hưng");
        pm.setNhiemKi("2026-2031");

        System.out.println("--Thủ tướng hiện tại là: " + pm.getTen() + " nhiệm kì: " + pm.getNhiemKi());

        Minister boTruong1 = new Minister("Bộ Quốc Phòng");
        Minister boTruong2 = new Minister("Bộ Công An");
        Minister boTruong3 = new Minister("Bộ Giáo Dục");
        Minister boTruong4 = new Minister("Bộ Tài Chính");

        boTruong1.submitReport("Tình hình quốc phòng");
        boTruong2.submitReport("Tình hình an ninh");
        boTruong3.submitReport("Tình hình kì thi THPT quốc gia");
        boTruong4.submitReport("Tình hình kinh tế trong quý 1");
    }
}
