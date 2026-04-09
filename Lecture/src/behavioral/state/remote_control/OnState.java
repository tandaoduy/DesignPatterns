package behavioral.state.remote_control;

public class OnState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("Mở TV");
        remote.setState(new OffState());
    }
}
