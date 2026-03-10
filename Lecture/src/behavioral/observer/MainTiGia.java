package behavioral.observer;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTu a = new NhaDauTuA("Duy Tan", t);
        NhaDauTu b = new NhaDauTuB("Duy Tran", t);
        System.out.println("Lấn 1");
        t.notify(5);
        b.HuyDangKy();
        System.out.println("Lần 2");
        t.notify(-5);
        b.DangKy();
        System.out.println("Lần 3:");
        t.notify(-5);
    }
}
