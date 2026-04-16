package behavioral.strategy.cc3;

public class KhuyenMaiPhanTramGiamToiDa implements IKhuyenMai{
    private double phamTramGiam;
    private double mucGiamToiDa;

    public KhuyenMaiPhanTramGiamToiDa(double phamTramGiam, double mucGiamToiDa) {
        this.phamTramGiam = phamTramGiam;
        this.mucGiamToiDa = mucGiamToiDa;
    }

    @Override
    public double tinhTienKhuyenMai(double tongTienHang) {
        double tinGiamTheoPhanTram = tongTienHang * phamTramGiam;
        return Math.min(tinGiamTheoPhanTram, mucGiamToiDa);

    }
}
