package JDBC.JdbcLectures.postgress.student;

import postgress.PostgressConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectStudentByAgePostgress {

    public void selectStudentsByAge(int minAge, int maxAge) {
        String selectQuery = "SELECT * FROM student WHERE age BETWEEN ? AND ?";

        try (Connection connection = PostgressConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {

            preparedStatement.setInt(1, minAge);
            preparedStatement.setInt(2, maxAge);

            ResultSet resultSet = preparedStatement.executeQuery();

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