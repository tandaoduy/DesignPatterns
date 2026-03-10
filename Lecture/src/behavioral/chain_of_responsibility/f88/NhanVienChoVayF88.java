package behavioral.chain_of_responsibility.f88;

public class NhanVienChoVayF88 extends NhanVienF88{
    NhanVienF88 successor;
    public NhanVienChoVayF88(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetVay(int khoanVay) {
        if(khoanVay <= this.hanMucDuyetVay)
            System.out.println(this.chucVu + " " + this.ten +"duyệt khoản vay: " + khoanVay);
        else
            this.successor.duyetVay(khoanVay);
    }

    @Override
    public NhanVienF88 successor(NhanVienF88 successor) {
        this.successor = successor;
        return this.successor;
    }
}
