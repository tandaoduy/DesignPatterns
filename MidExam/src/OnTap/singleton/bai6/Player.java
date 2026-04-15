package OnTap.singleton.bai6;

public class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void commitFoul(String foulType){

        Referee trongTai = Referee.getInstance();
        System.out.println("Cầu thủ " + playerName +" đã phạm lỗi" + foulType);
        trongTai.addCard(playerName + " (" + foulType + ")");
    }
}
