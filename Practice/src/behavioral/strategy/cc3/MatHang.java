package behavioral.strategy.cc3;

public class MatHang {
    private String ten;
    private int sl;
    private double donGia;

    public MatHang(String ten, int sl, double donGia) {
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return sl* donGia;
    }

    @Override
    public String toString() {
        return String.format("- %s: % d x %,.0f = %,.0f VND", ten,sl,donGia, getThanhTien());
    }
}
