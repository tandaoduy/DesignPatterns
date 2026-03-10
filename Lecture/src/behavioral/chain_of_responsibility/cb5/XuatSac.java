package behavioral.chain_of_responsibility.cb5;

public class XuatSac extends XepLoaiHocSinh{
    public XuatSac(String tenLoai, float nguong) {
        super(tenLoai, nguong);
    }

    @Override
    public void hocSinh(float diemChuan) {
        System.out.println(this.ten + " " + diemChuan + " " + "đạt loại Xuất Sắc");
    }

    @Override
    public XepLoaiHocSinh xepLoai(XepLoaiHocSinh xepLoai) {
        return null;
    }
}
