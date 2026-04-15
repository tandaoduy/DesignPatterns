package OnTap.singleton.bai6;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    private static Referee instance;
    private List<String> cards = new ArrayList<>();

    private Referee() {

    }

    public static Referee getInstance(){
        if (instance == null)
            instance = new Referee();
        return instance;
    }
    public void addCard(String detail){
        cards.add(detail);
        System.out.println("- Trọng tài đã ghi nận lỗi " + detail);
    }
    public void showCards(){
//       for (String card: cards){
//           System.out.println("Thẻ" + card);
//       }
        int yellowCards = 0;
        int redCards = 0;
        if (cards.isEmpty())
            System.out.println("Không có thẻ trong trận đấu");
        for (String card: cards){
            //System.out.println( card);
            if (card.toLowerCase().contains("vàng")){
                yellowCards++;
            }
            else if (card.toLowerCase().contains("đỏ")){
                redCards++;
            }
        }
        System.out.println("TỔNG KẾT SỐ THẺ TRONG TRẬN ĐẤU");
        System.out.println("Thẻ Vàng: " + yellowCards +"\nThẻ Đỏ: " + redCards);
    }
}
