package OnTap.singleton.bai2;

public class MainLog {
    public static void main(String[] args) {
        Module module1 = new Module("Xác thực");
        Module module2 = new Module("Giỏ hàng");
        Module module3 = new Module("Thanh toán");

        module1.operation("Đăng nhập hệ thống");
        module2.operation("Thêm hàng vào giỏ");
        module3.operation("Thanh toán QR code");

    }
}
