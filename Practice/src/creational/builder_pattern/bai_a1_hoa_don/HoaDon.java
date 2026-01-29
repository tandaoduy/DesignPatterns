package creational.builder_pattern.bai_a1_hoa_don;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List <CTHD> cthds;
    protected HoaDon(Builder b){
        this.header = b.header;
        this.cthds = b.cthds;
    }
    public  void inHD(){
        System.out.println(header.toString());
        for (var cthd: cthds){
            System.out.println(cthd);
        }
    }

    public static class Builder{
        HoaDonHeader header;
        List <CTHD> cthds = new ArrayList<>();

        public Builder buildHeader(String hdId, String ngayBan, String kH){
            header = new HoaDonHeader(hdId,ngayBan,kH);
            return this;
        }
        public Builder addCTHD(String sp, int sl, int donGia, float chietKhau){
            cthds.add(new CTHD(sp,sl,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
