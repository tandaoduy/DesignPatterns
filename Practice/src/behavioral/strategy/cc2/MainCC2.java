package behavioral.strategy.cc2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainCC2  {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        QLSV qlsv = new QLSV();
        qlsv.themSV(new SinhVien("Nguyen Van A", sdf.parse("21/12/2005"), 8.5f));
        qlsv.themSV(new SinhVien("Nguyen Van B", sdf.parse("20/12/2005"), 4.5f));
        qlsv.themSV(new SinhVien("Nguyen Van C", sdf.parse("27/12/2005"), 9.5f));
        qlsv.in();

        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.in();

        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.in();
    }
}
