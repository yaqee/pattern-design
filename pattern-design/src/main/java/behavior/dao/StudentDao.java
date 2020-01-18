package behavior.dao;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudent();

    void updateStudent(Student student);

    void deleteStudent(Student student);

    Student getStudent(int rollNo);
}
