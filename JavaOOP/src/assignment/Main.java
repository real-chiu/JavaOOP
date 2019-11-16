package assignment;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Tom", "Male", "11550123456", 22);
        System.out.println(student.getName());
        System.out.println(student.getGender());
        System.out.println(student.getStudentID());
        System.out.println(student.getAge());
    }
}
