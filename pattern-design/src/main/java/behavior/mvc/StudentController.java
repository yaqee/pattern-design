package behavior.mvc;

public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView studentView){
        this.student = student;
        this.view = studentView;
    }

    public void setStudentName(String name) {
        student.setName(name);
    }

    public String getStudentName() {
        return student.getName();
    }

    public void setRollNo(String rollNo) {
        student.setRollNo(rollNo);
    }

    public String getRollNo() {
        return student.getRollNo();
    }

    public void updateView() {
        view.updateView(student.getName(), student.getRollNo());
    }
}
