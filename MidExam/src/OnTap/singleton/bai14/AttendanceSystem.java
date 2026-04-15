package OnTap.singleton.bai14;

import java.util.ArrayList;
import java.util.List;

public class AttendanceSystem {
    private static AttendanceSystem instance;
    private List<Student> studentList = new ArrayList<>();

    private AttendanceSystem() {
    }
    public static AttendanceSystem getInstance(){
        if (instance == null)
            instance = new AttendanceSystem();
        return instance;
    }

    public void addstudentList(Student s){
        for (Student student : studentList){
            if (student.getMSSV().equals(s.getMSSV())){
                System.out.println("Sinh viên có mã số: " + s.getMSSV()+ " đã điểm danh rồi." );
                return;
            }
        }
        studentList.add(s);
        System.out.println("Điểm danh thành công:" + s.getMSSV());
    }

    public void showStudentList(){
        if (studentList.isEmpty()){
            System.out.println("Không có dữ liệu");
            return;
        }
        for (var s: studentList)
            System.out.println(" - MSSV: " + s + " điểm danh thành công");
    }
}
