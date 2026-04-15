package OnTap.singleton.bai3;

public class Database {
    private String connectionString;
    private static Database instance;

    private Database() {
    }

    public static Database getInstance(){
        if (instance == null)
            instance = new Database();
        return instance;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void execute(String query){
        if (this.connectionString == null){
            System.out.println("Database chưa được kết nối");
            return;
        }
        System.out.println("--- " + connectionString + " đang truy vấn: " + query);
    }
}
