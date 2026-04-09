package behavioral.template_method;

public class MonHocDB extends EnityDB<MonHoc> {
    @Override
    protected int getKey(MonHoc monHoc) {
        return monHoc.getMaMH();
    }
}
