package JDBC.JdbcLectures.postgress.student;

import postgress.PostgressConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudentPostgress {

    public void selectAllStudents() {
        String selectQuery = "SELECT * FROM student";

        try (Connection connection = PostgressConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Email: " + email);
            }

        } catch (SQLException e) {
            System.err.println("Error selecting data: " + e.getMessage());
        }
    }

}