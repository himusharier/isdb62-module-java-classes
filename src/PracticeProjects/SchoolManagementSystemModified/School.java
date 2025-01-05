package PracticeProjects.SchoolManagementSystemModified;

import java.util.List;

/**
 * In this class, it contains many teachers, many students.
 * Implements teachers and students using ArrayList.
 */
public class School {
    private String school;
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param school name of the school.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(String school, List<Teacher> teachers, List<Student> students) {
        this.school = school;
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the school name.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Updates school name.
     * @param school to update school name.
     */
    public void updateSchool(String school) {
        this.school = school;
    }

    /**
     * @return the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school.
     * @param student the student to be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds total money earned by the school.
     * @param moneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money that is spent by the school which is
     * the salary given by the school to its teachers.
     * @param moneySpent the money spent by the school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getSchool());
        return sb.toString();
    }

}
