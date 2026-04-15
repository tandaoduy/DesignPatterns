package OnTap.decorator.bai1;

public abstract class Photodecorator  implements IPhoto{
    protected IPhoto photos;

    public Photodecorator(IPhoto photos) {
        this.photos = photos;
    }

    @Override
    public void show() {
        photos.show();
    }
}
