package structural.decorator.B1;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(5);
        b = new Cong(b, 5);
        b = new Cong(b, 10);
        b = new Nhan(b, 3);
        System.out.println(b.toString());

    }
}
