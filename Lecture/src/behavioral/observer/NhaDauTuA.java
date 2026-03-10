package behavioral.observer;

public class NhaDauTuA extends NhaDauTu{
    public NhaDauTuA(String ten, TiGia t) {
        super(ten, t);
    }

    @Override
    public void listen(float delta) {
        if (delta >= 0)
            System.out.println(this.ten + ": Ban ra");
        else
            System.out.println(this.ten + ": Mua vao");
    }
}
