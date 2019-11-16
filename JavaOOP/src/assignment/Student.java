package assignment;

public class Student {
    private String name;
    private String gender;
    private String studentID;
    private int age;


    public Student (String name, String gender,  String studentID, int age) {
        this.name = name;
        this.gender = gender;
        this.studentID = studentID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
