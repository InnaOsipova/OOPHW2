package ru.gd.oseminar.data;

public class Student extends User{
    private long studentId;

    public Student(String firsNname, String lastName, String patronymic,long studentId) {
        super(firsNname, lastName, patronymic);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}'+ super.toString();
    }
}
