package OnTap.singleton.bai2;

public class Logger {
    private static Logger instance;
    private int count = 0;

    private Logger() {
    }

    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();
        return instance;
    }
    public void log(String message){
        count++;
        System.out.println("-- Log[" + count + "]: " + message);
    }
}
