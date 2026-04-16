package behavioral.strategy.cc2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diem;

    public SinhVien(String hoTen, Date ngaySinh, float diem) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy");
        return String.format("Ho ten:  %-20s | ngay sinh: %s | Diem trung binh %2f", hoTen, sdf.format(ngaySinh), diem);
    }
}
