package OnTap.singleton.bai12;

public class Citizen {
    private String cccd;

    public Citizen(String cccd) {
        this.cccd = cccd;
    }
    public void Register(){
        VacineCenter.getInstance().addCitizen(this.cccd);
    }


}
