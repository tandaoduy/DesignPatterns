package behavioral.observer.ca1;

import java.util.List;

public class Client implements Listener<List<MonHoc>>
{
    MyStream<List<MonHoc>> stream;

    public Client(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for(MonHoc m : monHocs){
            System.out.println(m.toString());
        }

    }
}
