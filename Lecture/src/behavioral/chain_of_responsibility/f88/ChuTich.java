package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NhanVienF88 {
    public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetVay(int khoanVay) {
        if(khoanVay<=this.hanMucDuyetVay)
            System.out.println(this.chucVu + " " + this.ten +"duyệt khoản vay: " + khoanVay);
        else
            System.out.println("Mày cút ra ngân hàng mà vay.");
    }

    @Override
    public NhanVienF88 successor(NhanVienF88 successor) {
        return null;
    }
}
