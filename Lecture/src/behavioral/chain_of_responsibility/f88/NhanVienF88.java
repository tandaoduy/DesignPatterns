package behavioral.chain_of_responsibility.f88;

public abstract class NhanVienF88 {
    String ten, chucVu;
    int hanMucDuyetVay;

    public NhanVienF88(String ten, String chucVu, int hanMucDuyetVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucDuyetVay = hanMucDuyetVay;
    }

    public abstract void duyetVay(int khoanVay);
    public abstract NhanVienF88 successor(NhanVienF88 successor);
}
