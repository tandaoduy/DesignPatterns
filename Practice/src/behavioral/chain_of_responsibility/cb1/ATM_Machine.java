package behavioral.chain_of_responsibility.cb1;

public class ATM_Machine {
    public static MoneyDispenser getDispenserChain(int maxDenomination){
        int[] availabelDenomination = {500,100,50,10,1};
        MoneyDispenser headOfChain = null;
        MoneyDispenser currentDispenser = null;
        for(int demon : availabelDenomination){
            if(demon <= maxDenomination){
                MoneyDispenser newDispenser = new DenominationDispenser(demon);
                if (headOfChain == null){
                    headOfChain = newDispenser;
                    currentDispenser = headOfChain;
                }

                else{
                    currentDispenser.setNextDispenser(newDispenser);
                    currentDispenser = newDispenser;
                }
            }
        }
        return headOfChain;
    }
}
