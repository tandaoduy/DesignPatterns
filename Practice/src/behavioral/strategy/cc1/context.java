package behavioral.strategy.cc1;

public class context {
    private ITinh tinhToan;

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b){
        if (this.tinhToan == null){
            throw new IllegalStateException("Loi");
        }
        return this.tinhToan.tinh(a,b);
    }
}
