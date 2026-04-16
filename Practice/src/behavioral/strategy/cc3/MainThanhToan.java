package behavioral.strategy.cc3;

public class MainThanhToan {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        gioHang.them(new MatHang("Bàn phím cơ", 1, 100000));
        gioHang.them(new MatHang("Chuột", 1, 500000));

        gioHang.setHinhThucThanhToan(new ThanhToanCOD());
        gioHang.setHinhThucKhuyenMai(null);
        gioHang.thanhToan();

        gioHang.setHinhThucThanhToan(new ThanhToanAirPay());
        gioHang.setHinhThucKhuyenMai(new KhuyenMaiPhanTramGiamToiDa(0.1, 100));
        gioHang.thanhToan();
    }
}
