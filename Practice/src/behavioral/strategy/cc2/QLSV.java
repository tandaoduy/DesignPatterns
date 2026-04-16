package behavioral.strategy.cc2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    private List<SinhVien> dsSV = new ArrayList<>();
    private ISoSanh<SinhVien> soSanh;

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    public void themSV(SinhVien sv){
        dsSV.add(sv);
    }
    public void sapXep(){
        if (soSanh == null){
            System.out.println("Vui long chon tieu chi sap xep");
            return;
        }
        int n = dsSV.size();
        for (int i = 0; i< n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (soSanh.soSanh(dsSV.get(i), dsSV.get(j)) == 1) {
                    SinhVien temp = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, temp);
                }
            }
        }
    }
    public void in(){
        for (SinhVien sv : dsSV){
            System.out.println(sv.toString());
        }
    }
}
