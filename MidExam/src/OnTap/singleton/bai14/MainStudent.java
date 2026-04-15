package OnTap.singleton.bai14;

public class MainStudent {
    public static void main(String[] args) {
        AttendanceSystem a = AttendanceSystem.getInstance();
        Student s1 = new Student("65133141");
        Student s2 = new Student("65131708");
        Student s3 = new Student("65134313");

        s1.checkIn();
        s2.checkIn();
        s2.checkIn();
        s3.checkIn();

        a.showStudentList();
    }
}
