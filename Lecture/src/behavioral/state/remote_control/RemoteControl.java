package behavioral.state.remote_control;

public class RemoteControl {
    public IRemoteState state;

    public RemoteControl() {
        this.state =new OffState();
    }

    public void setState(IRemoteState state) {
        this.state = state;
    }

    public void powerPress(){
        state.handle(this);
    }
}
