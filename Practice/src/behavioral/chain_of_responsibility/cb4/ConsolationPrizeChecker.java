package behavioral.chain_of_responsibility.cb4;

public class ConsolationPrizeChecker extends PrizeChecker{
    private String specialPrizeNumber;

    public ConsolationPrizeChecker(String specialPrizeNumber) {
        this.specialPrizeNumber = specialPrizeNumber;
    }

    @Override
    public void checkTicket(String ticketNumber) {
        String lastOfSpecial = specialPrizeNumber.substring(1);
        if(!ticketNumber.equals(specialPrizeNumber) && ticketNumber.endsWith(lastOfSpecial)){
            System.out.println("CHUC MUNG QUY KHACH! Ve So [" + ticketNumber+ "] da trung thuong Giai Khuyen Khich");
        } else if (nextChecker != null) {
            nextChecker.checkTicket(ticketNumber);
        }
    }
}
