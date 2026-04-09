package behavioral.chain_of_responsibility.cb4;

abstract class PrizeChecker {
    protected PrizeChecker nextChecker;

    public PrizeChecker setNextChecker(PrizeChecker nextChecker) {
        this.nextChecker = nextChecker;
        return this.nextChecker;
    }
    //thiết lập phương thức abstract cho việc dò vé
    public abstract void checkTicket(String ticketNumber);
}
