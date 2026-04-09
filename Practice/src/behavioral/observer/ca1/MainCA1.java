package behavioral.observer.ca1;
import java.util.Date;
import java.util.List;

public class MainCA1 {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        Client c = new Client(stream);
        DataAccess access = new DataAccess(stream);
        access.add(new MonHoc("KTTKPM",3));
        access.add(new MonHoc("LTTBDD",4));
        access.add(new MonHoc("LTTBDD",5));
    }
}
