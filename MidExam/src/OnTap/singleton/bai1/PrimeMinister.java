package OnTap.singleton.bai1;

public class PrimeMinister {
    private String ten, nhiemKi;
    private static PrimeMinister instance;

//    private PrimeMinister(String ten, String nhiemKi) {
//        this.ten = "Nhhhh;
//        this.nhiemKi = nhiemKi;
//    }
    //hay dùng nhất
    private PrimeMinister() {
    }


    public static PrimeMinister getInstance(){
        if(instance == null){
            instance = new PrimeMinister();
        }
        return instance;
    }

    public String getTen() {
        return ten;
    }

    public String getNhiemKi() {
        return nhiemKi;
    }

    public void setNhiemKi(String nhiemKi) {
        this.nhiemKi = nhiemKi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
