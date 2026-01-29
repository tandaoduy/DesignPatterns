package creational.singleton_pattern;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private int trump = 0, biden = 0;
    private List<String> voteUsers = new ArrayList<String>();
    //khai bao singleton
    private static Election instance;

    //hàm khởi tạo kiểu private
    private Election(){

    }
    //phương thức truy cập
    public static Election getInstance(){
        if(instance== null){
            instance = new Election();
        }
        return instance;
    }

    //phương thức vote
    protected void vote(Candidate c, String userId){
        for (String id: voteUsers)
            if(id.equals(userId))
                return;
        voteUsers.add(userId);
        if(c== Candidate.DONAL_TRUMP)
            trump++;
        else
            biden++;
    }

    //phương thức in kết quả
    public void printResult(){
        System.out.println("Donal Trump: " + trump);
        System.out.println("Joe Biden: " + biden);
    }

}
