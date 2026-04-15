package OnTap.singleton.bai12;

import java.util.ArrayList;
import java.util.List;

public class VacineCenter {
    private static VacineCenter intance;
    private List<String> registerCitizens = new ArrayList<>();

    private VacineCenter() {
    }

    public static VacineCenter getInstance(){
        if (intance == null){
            intance = new VacineCenter();
        }
        return intance;
    }

    public void addCitizen(String cccd){
        for (String c: registerCitizens){
            if (c.equals(cccd)){
                System.out.println("Đã có trong list rồi" + cccd);
                return;
            }
        }
        registerCitizens.add(cccd);
        System.out.println("Đã thêm số cccd:" + cccd + " vào danh sách");
    }

    public void showList(){
        if (registerCitizens.isEmpty())
            return;
        for (String r :registerCitizens){
            System.out.println("- " + r);
        }
    }
}
