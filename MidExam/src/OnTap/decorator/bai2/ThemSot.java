package OnTap.decorator.bai2;

public class ThemSot extends TuyChondecorator {
    private String tenSot;

    public ThemSot(IAnVat anVat, String tenSot) {
        super(anVat);
        this.tenSot = tenSot;
    }

    @Override
    public double TinhTien() {
        return super.TinhTien();
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " , thêm sốt: " + tenSot;
    }
}
