package behavioral.template_method;

public class MainTemplateMethod {
    public static void main(String[] args) {
        EnityDB<MonHoc> monhoc = new MonHocDB();
        monhoc.add(new MonHoc(1, "Lap trinh hdt", 3));
        monhoc.add(new MonHoc(2, "Lap trinh hdt", 3));
        monhoc.add(new MonHoc(3, "Lap trinh hdt", 3));

        monhoc.printInfo();

        monhoc.update(new MonHoc(2, "Thiet ke Web", 3));
        System.out.println();
        System.out.println("Sau khi cap nhat");
        monhoc.printInfo();

    }
}
