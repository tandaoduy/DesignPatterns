package creational.singleton.bai_a6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List <SanPham> sps = new ArrayList<>();
    private static DataAccess instance;

    private DataAccess() {
    }

    public static DataAccess getInstance(){
        if (instance == null)
            instance = new DataAccess();
        return instance;
    }

    public void add(SanPham s){
        sps.add(s);
    }

    public void inDS(){
        for(var sp:sps){
            System.out.println(sp.toString());
        }
    }
}
