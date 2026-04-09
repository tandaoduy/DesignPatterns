package behavioral.mediator;

public interface IChatMediator {
    void register(ChatUser user);
    void unregister(ChatUser user);
    void sendMesseage(String message, ChatUser form, String told);
    void sendBroadcast(String message, ChatUser form);
}
