package behavioral.chain_of_responsibility.cb4;

public class StandardPrizeChecker extends PrizeChecker{
    private String prizeName;
    private String[] winningNumbers;

    public StandardPrizeChecker(String prizeName, String[] winningNumbers) {
        this.prizeName = prizeName;
        this.winningNumbers = winningNumbers;
    }

    @Override
    public void checkTicket(String ticketNumber) {
        boolean isWon = false;
        for (String winningNUmber : winningNumbers){
            if(ticketNumber.endsWith(winningNUmber)){
                isWon = true;
                break;
            }
        }
        if (isWon){
            System.out.println("CHUC MUNG QUY KHACH! Ve So[" + ticketNumber + "] da trung thuong: " + prizeName);
        } else if (nextChecker != null) {
            nextChecker.checkTicket(ticketNumber);
        }
        else {
            System.out.println("CHUC MUNG QUY KHACH! Ve So[" + ticketNumber + "] khong trung thuong. CHUC QUY KHACH MAY MAN LAN SAU ");

        }
    }
}
