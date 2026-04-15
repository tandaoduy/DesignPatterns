package OnTap.decorator.bai1;

public class WatermarkDecorator extends Photodecorator{
    public WatermarkDecorator(IPhoto photos) {
        super(photos);
    }

    @Override
    public void show() {
        super.show();
        insertWatermark();
    }
    public void insertWatermark(){
        System.out.println("Đã chèn watermark vào trong ảnh");
    }
}
