package behavioral.strategy.cc3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<MatHang> dsMH = new ArrayList<>();
    private IThanhToan hinhThucThanhToan;
    private IKhuyenMai hinhThucKhuyenMai;

    public void setHinhThucThanhToan(IThanhToan hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public void setHinhThucKhuyenMai(IKhuyenMai hinhThucKhuyenMai) {
        this.hinhThucKhuyenMai = hinhThucKhuyenMai;
    }
    public void them(MatHang mh){
        dsMH.add(mh);
    }
    private double tinhTongTienHang(){
        double tong = 0;
        for (MatHang mh : dsMH){
            tong += mh.getThanhTien();
        }
        return tong;
    }
    public void thanhToan(){
        System.out.println("HOÁ ĐƠN THANH TOÁN");
        double tongTien = tinhTongTienHang();
        for (MatHang mh : dsMH){
            System.out.println(mh.toString());
        }
        System.out.println("-----------------------------");
        System.out.printf("Tổng tiền hàng: -%,0.f VND\n", tongTien);
        double tienGiamTT = 0;
        if (hinhThucThanhToan != null){
            tienGiamTT = hinhThucThanhToan.tinhTienGiam(tongTien);
            System.out.printf("Giảm giá thanh toán: -%,0.f VND\n", tienGiamTT);
        }
        double tienGiamKM = 0;
        if (hinhThucThanhToan != null){
            tienGiamKM = hinhThucThanhToan.tinhTienGiam(tongTien);
            System.out.printf("Tiền khuyến mãi: -%,0.f VND\n", tienGiamKM);
        }
        double totalbill = tongTien - tienGiamTT - tienGiamKM;
        totalbill = Math.max(totalbill,0);
        System.out.println("------------------------------");
        System.out.printf("SỐ TIỀN CẦN THANH TOÁN: %,.0f VND", totalbill);
    }
}
