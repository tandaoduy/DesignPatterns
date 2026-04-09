package behavioral.observer.ca5;

public class ATM {
    private ATMListener theATM;

    public void nhanThe(ATMListener tk) {
        this.theATM = theATM;
        System.out.println("Nhận thẻ thành cong.");
    }
    public void traThe(){
        System.out.println("Trả thẻ thành công.");
        this.theATM = null;
    }

    public void rutTien(int soTien){
        if(theATM == null){
            System.out.println("Mời mày đưa thẻ vào ATM");
            return;
        }
        if (theATM.kiemTraSoDu(soTien)){
            theATM.nhanThongBao(soTien, true);
        }
        else
            theATM.nhanThongBao(soTien, false);
    }

}
