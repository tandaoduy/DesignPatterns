package OnTap.decorator.bai1;

public class BorderDecorator extends Photodecorator{
    public BorderDecorator(IPhoto photos) {
        super(photos);
    }

    @Override
    public void show() {
        super.show();
        drawBorder();

    }
    public void drawBorder(){
        System.out.println("Đã thêm khung viền vuông cho hình.");
    }
}
