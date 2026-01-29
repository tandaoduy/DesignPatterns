package sesson_1.bai_j1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien();
//        NhanVien nv2 = new NhanVien("Nguyễn Văn An", "Nha Trang", 21, 210, 6000000 );
//        System.out.println(nv1.toString());
//        System.out.println("Thưởng:" + nv1.tinhThuong(0));
//        System.out.println(nv2.toString());
//        System.out.println("Thưởng:" + nv2.tinhThuong(0));

        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        NhanVien nv1 = new NhanVien("Nguyễn Văn An", "Nha Trang", 21, 210, 6000000 );
        NhanVien nv2 = new NhanVien("Nguyễn Văn Bình", "Nha Trang", 21, 210, 6000000 );
        NhanVien nv3 = new NhanVien("Nguyễn Văn Cường", "Nha Trang", 21, 210, 6000000 );
        NhanVien nv4 = new NhanVien("Nguyễn Văn Dũng", "Nha Trang", 21, 210, 6000000 );
        NhanVien nv5 = new NhanVien("Nguyễn Văn Em", "Nha Trang", 21, 210, 6000000 );

        //thêm
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);

        //in
        qlnv.inDS();
    }
}
