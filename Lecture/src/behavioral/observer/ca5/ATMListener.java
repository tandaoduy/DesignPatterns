package behavioral.observer.ca5;

public interface ATMListener {
    boolean kiemTraSoDu(int soTien);
    void nhanThongBao(int soTienRut, boolean thanhCong);
}

