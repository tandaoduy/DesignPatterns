package behavioral.chain_of_responsibility.cb4;

public class MainCb4 {
    public static void main(String[] args) {
        String specialWinningNum = "123456";
        PrizeChecker specialPrize = new StandardPrizeChecker("Giai Dac Biet", new String[]{specialWinningNum});
        PrizeChecker consolationPrize = new ConsolationPrizeChecker(specialWinningNum);
        PrizeChecker firstPrize = new StandardPrizeChecker("Giai Nhat", new String[]{"3456"});
        PrizeChecker secondPrize = new StandardPrizeChecker("Giai Nhi", new String[]{"456"});

        specialPrize.setNextChecker(consolationPrize)
                .setNextChecker(firstPrize)
                .setNextChecker(secondPrize);

        System.out.println("HE THONG DO VE SO");
        specialPrize.checkTicket("123456");
        specialPrize.checkTicket("823456");
        specialPrize.checkTicket("833456");
        specialPrize.checkTicket("838456");
        specialPrize.checkTicket("222222");
    }
}
