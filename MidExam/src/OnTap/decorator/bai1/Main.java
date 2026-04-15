package OnTap.decorator.bai1;

public class Main {
    public static void main(String[] args) {
        IPhoto myPhoto = new BasicPhoto();

        System.out.println("--- Ảnh 1: Chỉ có khung ---");
        IPhoto photoWithBorder = new BorderDecorator(myPhoto);
        photoWithBorder.show();

        System.out.println("\n--- Ảnh 2: Full option (Khung + Watermark + Lọc màu) ---");
        // Bạn bọc chúng lại như thế này:
        IPhoto fullOptionPhoto = new FilterDecorator(
                new WatermarkDecorator(
                        new BorderDecorator(myPhoto)
                )
        );

        fullOptionPhoto.show();
    }
}
