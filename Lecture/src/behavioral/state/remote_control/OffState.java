package behavioral.state.remote_control;

public class OffState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("Tắt TV");
        remote.setState(new OnState());
    }
}
