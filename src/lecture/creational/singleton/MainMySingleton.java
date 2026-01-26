package lecture.creational.singleton;

public class MainMySingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();//quy tắc singleton: tạo 1 object duy nhất
        MySingleton s2 = MySingleton.getInstance();//trỏ s2 tới 1(không tạo ra object mới)
        //s2 và s1 sẽ cùng trỏ tới 1 object đã tạo ra khi tạo s1.
        s1.myPrint();//1
        s2.myPrint();//2
        s1.myPrint();
        s2.myPrint();
        s1.myPrint();
        s1.myPrint();
    }
    // kết quả 1 2 3 4 5 6

}
