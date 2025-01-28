package JDBC.CW_28_01_2025;

import java.sql.*;

import static JDBC.CW_28_01_2025.DBConnection.getConnection;

public class FetchData {
    public static void main(String[] args) {
        FetchData fetchData = new FetchData();
        System.out.printf("%-5s %-15s %-10s %-10s %-15s %-5s %n", "id", "name", "grade", "age", "classTeacher", "mark");
        System.out.printf("----------------------------------------------------------------\n");
        fetchData.fetchData();
    }


    private void fetchData() {
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

                System.out.printf("%-5d %-15s %-10d %-10d %-15s %-5.0f %n", id, name, grade, age, classTeacher, mark);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
