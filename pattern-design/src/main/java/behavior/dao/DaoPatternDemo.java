package behavior.dao;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        for (Student student: studentDao.getAllStudent()) {
            System.out.println("Student: [Roll no: " + student.getRollNo() + ", name: "
                    + student.getName() + "]");
        }

        Student student = studentDao.getAllStudent().get(0);
        student.setName("Michale");
        studentDao.updateStudent(student);

        student = studentDao.getStudent(0);
        System.out.println("Student: [RollNo: " + student.getRollNo() + ", name:" +
                student.getName());
    }
}
