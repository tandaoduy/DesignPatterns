package behavioral.observer.ca1;

import java.util.ArrayList;
import java.util.List;

public class MyStream <T>{
    List<Listener> listeners = new ArrayList<>();
    public void addListener(Listener l){
        listeners.add(l);
    }
    public void addEvent(T t){
        for (var listener : listeners )
            listener.listen(t);

    }

}
