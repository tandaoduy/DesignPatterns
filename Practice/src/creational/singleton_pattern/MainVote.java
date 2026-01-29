package creational.singleton;

public class MainVote {
    public static void main(String[] args) {
        User u1 = new User("Tấn");
        User u2 = new User("Duy");
        User u3 = new User("Đào");

        u1.vote(Candidate.DONAL_TRUMP);
        u2.vote(Candidate.JOE_BIDEN);
        u3.vote(Candidate.DONAL_TRUMP);
        Election.getInstance().printResult();


        u1.vote(Candidate.DONAL_TRUMP);
        Election.getInstance().printResult();
    }
}
