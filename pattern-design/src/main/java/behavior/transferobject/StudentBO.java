package behavior.transferobject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    private List<StudentVO> studentVOList;

    public StudentBO() {
        this.studentVOList = new ArrayList<>();
        studentVOList.add(new StudentVO("Robert", 0));
        studentVOList.add(new StudentVO("John", 1));
    }

    public List<StudentVO> getAllStudents() {
        return studentVOList;
    }

    public StudentVO getStudentVO(int rollNo) {
        return studentVOList.get(rollNo);
    }

    public void deleteStudentVO(StudentVO studentVO) {
        studentVOList.remove(studentVO.getRollNo());
        System.out.println("Student roll no " + studentVO.getRollNo() + ", deleted from database.");
    }

    public void updateStudentVO(StudentVO studentVO){
        studentVOList.get(studentVO.getRollNo()).setName(studentVO.getName());
        System.out.println("Student roll no " + studentVO.getRollNo() + ", updated in the database.");

    }
}
