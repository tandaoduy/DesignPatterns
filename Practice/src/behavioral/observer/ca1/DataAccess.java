package behavioral.observer.ca1;
import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> monHocs = new ArrayList<>();
    MyStream <List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void add(MonHoc m){
        monHocs.add(m);
        stream.addEvent(monHocs);
    }
}
