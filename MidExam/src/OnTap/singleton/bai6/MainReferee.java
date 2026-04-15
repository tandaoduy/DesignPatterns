package OnTap.singleton.bai6;

public class MainReferee {
    public static void main(String[] args) {
        Referee trongTai = Referee.getInstance();
        Player cauThu1 = new Player("Quốc Việt");
        Player cauThu2 = new Player("Văn Bình");

        cauThu1.commitFoul(" Thẻ đỏ - chơi gạt giò đối thủ");
        cauThu2.commitFoul(" Thẻ vàng- tuột quần đối thủ");
        trongTai.showCards();
    }
}
