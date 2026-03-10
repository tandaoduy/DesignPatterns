package behavioral.observer;

public abstract class NhaDauTu implements TiGia.TiGiaListener {
    TiGia t;
    String ten;
    public NhaDauTu(String ten,TiGia t) {
        this.ten = ten;
        this.t = t;
        t.attach(this);
    }
    public void DangKy(){
        t.attach(this);
    }
    public void HuyDangKy(){
        t.detach(this);
    }
}
