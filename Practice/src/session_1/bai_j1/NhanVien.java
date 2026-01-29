package sesson_1.bai_j1;

public class NhanVien {
    private String ten, diaChi;
    private int tuoi, tongGioLam;
    private double luong;

    //khởi taọ không tham số
    public NhanVien() {
        ten = "Đào Duy Tấn";
        tuoi = 21;
        diaChi = "Nha Trang";
        luong = 2000000;
        tongGioLam = 130;
    }

    //khởi tạo có tham số
    public NhanVien(String ten, String diaChi, int tuoi, int tongGioLam, double luong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tongGioLam = tongGioLam;
        this.luong = luong;
    }

    //hàm het, set

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    //trả về thông tin nhân viên
    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                ", tongGioLam=" + tongGioLam +
                ", luong=" + luong +
                '}';
    }
    public double tinhThuong(double thuong){
        if(tongGioLam >= 200)
            thuong = luong *0.2;
        else if(tongGioLam < 200 && tongGioLam >=100)
            thuong = luong * 0.1;
        else thuong =0;
        return  thuong;
    }
}
