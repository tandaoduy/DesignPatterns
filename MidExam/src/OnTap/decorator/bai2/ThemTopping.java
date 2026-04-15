package OnTap.decorator.bai2;

public class ThemTopping extends TuyChondecorator{
    private String tenTopping;

    public ThemTopping(IAnVat anVat, String tenTopping) {
        super(anVat);
        this.tenTopping = tenTopping;
    }

    @Override
    public double TinhTien() {
        return super.TinhTien();
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + ", thêm " + tenTopping;
    }
}
