package behavior.mvc;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retreiveStudentFromDatabase();
        StudentView studentView = new StudentView();
        StudentController sc = new StudentController(model, studentView);
        sc.updateView();

        sc.setStudentName("John");
        sc.setRollNo("01");
        sc.updateView();
    }

    private static Student retreiveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
