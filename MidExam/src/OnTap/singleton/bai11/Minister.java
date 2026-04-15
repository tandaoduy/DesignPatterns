package OnTap.singleton.bai11;

public class Minister {
    private String name;
    private String decree;
    private int count = 0;

    public Minister(String name) {
        this.name = name;
    }
    public void proposeDecree(String content){
//        PrimeMinister pm = PrimeMinister.getInstance();
//        if (count < 3){
//            pm.receiveDecree(name + " gửi sắc lệnh: " + content);
//            count++;
//        }
//        else System.out.println("Vượt quá số lượng sắc lệnh cho phép");
        if (count < 3) {
            Minister banGhi = new Minister(this.name);
            banGhi.decree = content;
            PrimeMinister.getInstance().receiveDecree(banGhi);

            System.out.println("+ " + this.name + " gửi thành công: " + content);

            count++;
        } else {
            // In ra dòng lỗi ngay tại đây
            System.out.println(name + " đã vượt quá số lượng cho phép (" + content + ")");
        }
    }

    @Override
    public String toString() {
        return "- Bộ trưởng: " + name + " gửi sắc lệnh: " + decree;
    }
}
