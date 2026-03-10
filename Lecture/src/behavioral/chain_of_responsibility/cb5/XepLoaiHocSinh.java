package behavioral.chain_of_responsibility.cb5;

public abstract class XepLoaiHocSinh {
    String ten;
    float diem;

    public XepLoaiHocSinh(String ten, float diem) {
        this.ten = ten;
        this.diem = diem;
    }
    public abstract void hocSinh(float diemChuan);
    public abstract XepLoaiHocSinh xepLoai(XepLoaiHocSinh xepLoai);
}
