package OnTap.decorator.bai1;

public class FilterDecorator extends Photodecorator{
    public FilterDecorator(IPhoto photos) {
        super(photos);
    }

    @Override
    public void show() {
        super.show();
        apllyDecorator();
    }
    public void apllyDecorator(){
        System.out.println("Đã áp dụng bộ lọc màu");
    }
}
