package creational.singleton.bai_a6;

public class SanPham {
    String id, ten;
    int gia, sl;

    public SanPham(String id, String ten, int gia, int sl) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.sl = sl;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", sl=" + sl +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
}
