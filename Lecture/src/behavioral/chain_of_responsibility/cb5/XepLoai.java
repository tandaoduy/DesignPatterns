package behavioral.chain_of_responsibility.cb5;

public class XepLoai extends XepLoaiHocSinh{
    XepLoaiHocSinh xepLoai;

    public XepLoai(String ten, float nguong, XepLoaiHocSinh xepLoai) {
        super(ten, nguong);
        this.xepLoai = xepLoai;
    }

    @Override
    public void hocSinh(float diemChuan) {
        if(diemChuan < 9)
            System.out.println(this.ten + " " + diemChuan + " " + "đạt loại Gioi");
        if(diemChuan < 8)
            System.out.println(this.ten + " " + diemChuan + " " + "đạt loại Khá");
        if(diemChuan < 7)
            System.out.println(this.ten + " " + diemChuan + " " + "đạt loại Trung Bình");
        if(diemChuan < 5)
            System.out.println(this.ten + " " + diemChuan + " " + "đạt loại Yếu");

    }

    @Override
    public XepLoaiHocSinh xepLoai(XepLoaiHocSinh xepLoai) {
        this.xepLoai = xepLoai;
        return this.xepLoai;
    }
}
