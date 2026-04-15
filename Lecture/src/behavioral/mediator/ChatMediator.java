package behavioral.mediator;

import java.util.HashMap;

public class ChatMediator implements IChatMediator {
    HashMap<String, ChatUser> userMaps = new HashMap<>();

    @Override
    public void register(ChatUser user) {
        userMaps.put(user.id, user);
    }

    @Override
    public void unregister(ChatUser user) {
        userMaps.remove(user);
    }

    @Override
    public void sendMesseage(String message, ChatUser form, String told) {

    }

    @Override
    public void sendBroadcast(String message, ChatUser form) {

    }
}
