package behavioral.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 bv = new NhanVienChoVayF88("Trần Quốc Việt", "bảo vệ", 1_000_000);
        NhanVienF88 nv = new NhanVienChoVayF88("Lê Kim Linh", "Nhân viển", 10_000_000);
        NhanVienF88 thuky = new NhanVienChoVayF88("Đào Duy Tấn", "Thư ký", 50_000_000);
        NhanVienF88 truongPhong = new NhanVienChoVayF88("Kiệt", "Trưởng Phòng", 100_000_000);
        NhanVienF88 giamDoc = new NhanVienChoVayF88("Bình", "Giám đốc", 500_000_000);
        NhanVienF88 chuTich = new ChuTich("Tấn đẹp trai", "Chủ tịch", 1_000_000_000);

        bv.successor(bv).successor(nv).successor(thuky).successor(truongPhong).successor(giamDoc).successor(chuTich);
        bv.duyetVay(2_000_000);
        bv.duyetVay(700_000_000);
        bv.duyetVay(2_000_000_000);
    }
}
