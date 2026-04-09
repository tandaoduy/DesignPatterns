package behavioral.observer.ca5;

public class Mainca5 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan(10000, atm);
        taiKhoan.duaThe();
        taiKhoan.nhanThongBao(4600, true);
        taiKhoan.traThe();
        taiKhoan.duaThe();
        taiKhoan.nhanThongBao(4600, true);
        taiKhoan.traThe();
    }
}
