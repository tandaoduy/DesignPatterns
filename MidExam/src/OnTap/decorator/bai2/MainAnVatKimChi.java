package OnTap.decorator.bai2;

public class MainAnVatKimChi {
    public static void main(String[] args) {
        IAnVat anVat1 = new SanPhamCoBan("Trà sữa khoai môn", "Vị truyền thống", 35000);
        System.out.println("Thêm Topping");
        IAnVat to1 = new ThemTopping(anVat1, "Trân châu trắng");
        System.out.println("Add max giarm gias");
       IAnVat ma1 = new ApMaGiam(anVat1,15);

        System.out.println(anVat1.TinhTien());
        System.out.println(anVat1.getMoTa());


    }
}
