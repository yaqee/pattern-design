package behavior.transferobject;

public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();
        //打印所有学生信息
        for(StudentVO studentVO: studentBO.getAllStudents()) {
            System.out.println("Student: [roll no :" + studentVO.getRollNo() + ", name:"
                    + studentVO.getName() + "]");
        }

        //更新第一个学生的信息
        StudentVO studentVO = studentBO.getAllStudents().get(0);
        studentVO.setName("Michael");
        studentBO.updateStudentVO(studentVO);

        //获取更新后第一个学生的信息
        StudentVO studentVONew = studentBO.getStudentVO(0);
        System.out.println("Student:[roll no " + studentVONew.getRollNo() + ", name "
                + studentVONew.getName() + "]");

        //删除第一个学生信息
        studentBO.deleteStudentVO(studentBO.getStudentVO(0));

        //打印所有学生信息
        for(StudentVO student: studentBO.getAllStudents()) {
            System.out.println("Student: [roll no :" + student.getRollNo() + ", name:"
                    + student.getName() + "]");
        }

    }
}
