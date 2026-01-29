package sesson_1.bai_j1;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy{
    private List<NhanVien> danhSach = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        danhSach.add(nv);
    }

    @Override
    public void inDS() {
        for (int i = 0; i < danhSach.size(); i++){
            System.out.println(danhSach.get(i));
        }
    }
}
