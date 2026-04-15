package OnTap.decorator.bai2;

public class ApMaGiam extends TuyChondecorator{
    private double phanTramGiam;

    public ApMaGiam(IAnVat anVat, double phanTramGiam) {
        super(anVat);
        this.phanTramGiam = phanTramGiam;
    }

    @Override
    public double TinhTien() {
        return super.TinhTien() * (1 - phanTramGiam / 100);
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " được giảm " + phanTramGiam +" %";
    }
}
