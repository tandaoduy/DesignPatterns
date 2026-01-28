package creational.singleton;

public class MySingleton {
    private static MySingleton instance;
    //dd su sung singleton
    int count = 0;
    private MySingleton(){

    }

    public static MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
    public void myPrint(){
        System.out.println(++count);
    }


}
