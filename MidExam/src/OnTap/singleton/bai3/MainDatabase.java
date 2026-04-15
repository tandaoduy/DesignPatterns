package OnTap.singleton.bai3;

public class MainDatabase {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        db.setConnectionString("localhost:3500");

        db.execute("FROM * LOPHOC");
        db.execute("FROM * DIEM");
    }
}
