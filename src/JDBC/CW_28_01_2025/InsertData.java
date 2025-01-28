package JDBC.CW_28_01_2025;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static JDBC.CW_28_01_2025.DBConnection.getConnection;

public class InsertData {

    public static void main(String[] args) {
        // creating 5 objects:
        Student student1 = new Student(1, "Omar", 5, 18, "Nahid", 80.0);
        Student student2 = new Student(2, "Ikram", 6, 19, "Ashik", 85.0);
        Student student3 = new Student(3, "Himu", 7, 20, "Jahid", 90.0);
        Student student4 = new Student(4, "Rasel", 8, 21, "Hemel", 95.0);
        Student student5 = new Student(5, "Faysal", 9, 22, "Zakaria", null);

        //making a list with the objects:
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        InsertData insertData = new InsertData();
        //executing data insert method:
        insertData.insertData(students);


    }

    //data insert method:
    private void insertData(List<Student> students) {
        String sql = "INSERT INTO cw_tuesday_students (id, name, grade, age, class_teacher, mark) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (Student student : students) {
                preparedStatement.setInt(1, student.getId());
                preparedStatement.setString(2, student.getName());
                preparedStatement.setInt(3, student.getGrade());
                preparedStatement.setInt(4, student.getAge());
                preparedStatement.setString(5, student.getClassTeacher());
                //setting null value:
                if (student.getMark() != null) {
                    preparedStatement.setDouble(6, student.getMark());
                } else {
                    preparedStatement.setNull(6, Types.DOUBLE);
                }

                if (preparedStatement.executeUpdate() > 0) {
                    System.out.println("data inserted!");
                } else {
                    System.out.println("data can not inserted!");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //fetch

}
