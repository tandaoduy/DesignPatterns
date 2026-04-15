package OnTap.singleton.bai11;

import java.util.ArrayList;
import java.util.List;

public class PrimeMinister {
    private static PrimeMinister instance;
    private List<Minister> decree = new ArrayList<>();

    private PrimeMinister() {
    }

    public static PrimeMinister getInstance(){
        if (instance == null)
            instance = new PrimeMinister();
        return instance;
    }
    public void receiveDecree(Minister m){
        decree.add(m);
    }

    public void showAllDecree(){
        if (decree.isEmpty()) return;
        for (Minister m : decree)
            System.out.println(m);

    }

}
