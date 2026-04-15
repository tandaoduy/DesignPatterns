package OnTap.decorator.bai2;

public class SanPhamCoBan implements IAnVat{
    private String ten, moTa;
    private double gia;

    public SanPhamCoBan(String ten, String moTa, double gia) {
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
    }

    @Override
    public double TinhTien() {
        return gia;
    }

    @Override
    public String getMoTa() {
        return ten + " "+ moTa;
    }
}
