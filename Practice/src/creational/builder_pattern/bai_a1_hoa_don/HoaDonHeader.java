package creational.builder_pattern.bai_a1_hoa_don;

public class HoaDonHeader {
    String hdId, ngay, kH;

    public HoaDonHeader(String hdId, String ngay, String kH) {
        this.hdId = hdId;
        this.ngay = ngay;
        this.kH = kH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "hdId='" + hdId + '\'' +
                ", ngay='" + ngay + '\'' +
                ", kH='" + kH + '\'' +
                '}';
    }

    public String getHdId() {
        return hdId;
    }

    public void setHdId(String hdId) {
        this.hdId = hdId;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getkH() {
        return kH;
    }

    public void setkH(String kH) {
        this.kH = kH;
    }
}
