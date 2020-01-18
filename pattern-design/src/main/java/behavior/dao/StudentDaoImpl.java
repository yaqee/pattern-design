package behavior.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> studentList;

    public StudentDaoImpl() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Robert", 0));
        studentList.add(new Student("John", 1));
    }

    @Override
    public List<Student> getAllStudent() {
        return studentList;
    }

    @Override
    public void updateStudent(Student student) {
        studentList.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll no " + student.getRollNo() + ", update in the database.");
    }

    @Override
    public void deleteStudent(Student student) {
        studentList.remove(student.getRollNo());
        System.out.println("Student: Roll no " + student.getRollNo() + ", delete from database.");
    }

    @Override
    public Student getStudent(int rollNo) {
        return studentList.get(rollNo);
    }
}
