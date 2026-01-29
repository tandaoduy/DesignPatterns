package creational.builder_pattern.bai_a1_hoa_don;

public class CTHD {
    String sp;
    int sl, dg;
    float chietKhau;

    public CTHD(String sp, int sl, int dg, float chietKhau) {
        this.sp = sp;
        this.sl = sl;
        this.dg = dg;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sp='" + sp + '\'' +
                ", sl=" + sl +
                ", dg=" + dg +
                ", chietKhau=" + chietKhau +
                '}';
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getDg() {
        return dg;
    }

    public void setDg(int dg) {
        this.dg = dg;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
}
