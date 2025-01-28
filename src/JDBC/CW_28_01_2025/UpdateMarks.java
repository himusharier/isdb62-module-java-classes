package JDBC.CW_28_01_2025;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static JDBC.CW_28_01_2025.DBConnection.getConnection;

public class UpdateMarks {
    public static void main(String[] args) {
        UpdateMarks updateMarks = new UpdateMarks();
        updateMarks.updateData();
    }

    private void updateData() {
        List<Student> updateStudent = new ArrayList<>();
        String sql = "SELECT * FROM cw_tuesday_students";
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int grade = resultSet.getInt("grade");
                int age = resultSet.getInt("age");
                String classTeacher = resultSet.getString("class_teacher");
                Double mark = resultSet.getDouble("mark");

                //System.out.printf("%-5d %-15s %-10d %-10d %-15s %-5.0f %n", id, name, grade, age, classTeacher, mark);
                Double updateMark;
                if (mark != null) {
                    updateMark = mark + (mark * 0.05);
                } else {
                    updateMark = null;
                }

                updateStudent.add(new Student(id, name, grade, age, classTeacher, mark));

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
