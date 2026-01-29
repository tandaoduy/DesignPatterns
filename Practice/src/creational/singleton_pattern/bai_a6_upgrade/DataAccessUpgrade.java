package creational.singleton_pattern.bai_a6_upgrade;

import java.util.*;

public class DataAccessUpgrade {
    //singleton cho từng cặp key value
    private static Map<String, DataAccessUpgrade> instances = new Hashtable<>();
    List <SanPham> sps = new ArrayList<>();
    private DataAccessUpgrade() {
    }

    public static DataAccessUpgrade getInstance(String tag){
        if (instances.get(tag) == null)
            instances.put(tag, new DataAccessUpgrade());
        return instances.get(tag);
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
