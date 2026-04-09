package behavioral.observer.ca5;

public class TaiKhoan implements ATMListener {
    int soDu;
    ATM atm;

    public TaiKhoan( int soDu, ATM atm) {
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaThe(){
        atm.nhanThe(this);
    }
    public void traThe(){
        atm.traThe();
    }


    @Override
    public boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong){
            soDu = soDu - soTienRut;
            System.out.println("Rút tiền thành công. Số dư còn lại là:" + soDu);
        }
        else System.out.println("Rút tiền không thành công.");
    }
}
