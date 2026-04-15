package OnTap.decorator.bai2;

public class DongGoi extends TuyChondecorator{
    public DongGoi(IAnVat anVat) {
        super(anVat);
    }

    @Override
    public double TinhTien() {
        return super.TinhTien();
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + "đã đóng gói sản phẩm";
    }
}
