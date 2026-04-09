package behavioral.template_method;

public class SinhVienDB extends EnityDB<SinhVien>{
    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.getMaSV();
    }
}
