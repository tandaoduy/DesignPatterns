package behavioral.mediator;

public abstract class ChatUser implements IChatMediator{
    protected String id;
    protected String name;
    protected IChatMediator mediator;

    public ChatUser(String id, String name, IChatMediator mediator) {
        this.id = id;
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void register(ChatUser user) {
        mediator.register(this);

    }

    @Override
    public void unregister(ChatUser user) {
        mediator.unregister(this);
    }

    @Override
    public void sendMesseage(String message, ChatUser form, String told) {
        System.out.println(name + " da gui tin nhan" + told + ":" + message);
        mediator.sendMesseage(message, this, told);

    }

    @Override
    public void sendBroadcast(String message, ChatUser form) {

    }

    public void recieve(String message, ChatUser form){}
}
