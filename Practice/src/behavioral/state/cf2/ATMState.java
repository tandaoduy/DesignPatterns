package behavioral.state.cf2;

public abstract class ATMState {
    public abstract void withdraw(ATMMachine context, int amount);
}
