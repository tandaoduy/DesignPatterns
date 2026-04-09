package OnTap.singleton;

public class ThuTuong {
    //ừ khóa static chỉ có 1 biến instance bất ể ứng dụng chạy bao lu
    private static ThuTuong instance;

    //2. constructor phải là private
    //private: ngăn chặn new từ bên ngoài
    private ThuTuong(){}


    //3. static method
    // static thộc về lớp, truy cập thông qua tên lớp, không truy cập thông qua đối tượng
    public ThuTuong getInstance(){
        //chưa có thì tạo mới - khởi tạo muộn: chưa c thì tạo, ế
        //lazy intitialization
        if (instance == null){
            instance = new ThuTuong();
        }
        return instance;
    }
}
