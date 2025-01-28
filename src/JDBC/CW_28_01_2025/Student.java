package JDBC.CW_28_01_2025;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int age;
    private String classTeacher;
    private Double mark;

    public Student(int id, String name, int grade, int age, String classTeacher, Double mark) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.classTeacher = classTeacher;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public Double getMark() {
        return mark;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }
}
