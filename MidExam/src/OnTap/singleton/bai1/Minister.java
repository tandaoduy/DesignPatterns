package OnTap.singleton.bai1;

public class Minister {
    private String name;

    public Minister(String name) {
        this.name = name;
    }
    public void submitReport(String content){
        // Lấy ông Thủ tướng duy nhất ra
        PrimeMinister pm = PrimeMinister.getInstance();
        System.out.println("-- Bộ trưởng " + name + " gửi báo cáo đến Thủ tướng " + pm.getTen() + " nhiệm kì: "+ pm.getNhiemKi() + " báo cáo về "+ content);
    }

}
