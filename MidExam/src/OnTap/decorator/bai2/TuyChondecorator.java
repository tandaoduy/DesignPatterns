package OnTap.decorator.bai2;

public abstract class TuyChondecorator implements IAnVat{
    protected IAnVat anVat;

    public TuyChondecorator(IAnVat anVat) {
        this.anVat = anVat;
    }

    @Override
    public double TinhTien() {
        return anVat.TinhTien();
    }

    @Override
    public String getMoTa() {
        return anVat.getMoTa();
    }
}
