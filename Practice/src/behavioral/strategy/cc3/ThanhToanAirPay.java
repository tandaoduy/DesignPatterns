package behavioral.strategy.cc3;

public class ThanhToanAirPay implements IThanhToan{
    @Override
    public double tinhTienGiam(double tongTienHang) {
        if (tongTienHang >= 1000000)
            return tongTienHang*0.03;
        return tongTienHang;
    }
}
