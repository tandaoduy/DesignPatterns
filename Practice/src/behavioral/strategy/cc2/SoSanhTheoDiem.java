package behavioral.strategy.cc2;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.getDiem() > o2.getDiem())    return 1;
        if (o1.getDiem() < o2.getDiem())    return -1;
        return  0;
    }
}
