package OnTap.singleton.bai12;

public class MainVaccineCenter {
    public static void main(String[] args) {
        VacineCenter vc = VacineCenter.getInstance();
        Citizen c1 = new Citizen("09876543321");
        Citizen c2 = new Citizen("0123456789");
        Citizen c3 = new Citizen("09875321");

        c1.Register();
        c2.Register();
        c1.Register();
        c3.Register();
        vc.showList();
    }
}
