package OnTap.singleton.bai14;

public class Student {
    private String MSSV;

    public Student(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMSSV() {
        return MSSV;
    }

    @Override
    public String toString() {
        return "Student{" +
                "MSSV='" + MSSV + '\'' +
                '}';
    }

    public void checkIn(){
        AttendanceSystem.getInstance().addstudentList(this);
    }

}
