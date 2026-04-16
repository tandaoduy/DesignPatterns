package behavioral.state.cf2;

public class ATMMachine {
    private ATMState currentState;
    private int cashInMachine;
    private final int MAX_WITHDRAWAL = 500000000;

    public ATMMachine(int initialCash) {
        this.cashInMachine = initialCash;
        if (this.cashInMachine == 0){
            this.currentState = new OutOffMoneyState();
        } else if (this.cashInMachine < MAX_WITHDRAWAL) {
            this.currentState = new LimitedState();
        }
        else this.currentState = new ReadyState();
    }
    public void setState(ATMState state){
        this.currentState = state;
    }
    public int getCashInMachine(){
        return cashInMachine;
    }
    public void setCashInMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }
    public int getMaxWithdrawal(){
        return MAX_WITHDRAWAL;
    }
    public void withdrawal(int amount){
        currentState.withdraw(this, amount);
    }
}
