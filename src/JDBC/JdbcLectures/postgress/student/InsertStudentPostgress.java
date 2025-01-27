package JDBC.JdbcLectures.postgress.student;

import postgress.PostgressConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentPostgress {

    public void insertDummyData(String[][] students) {
        String insertQuery = "INSERT INTO student (name, age, email) VALUES (?, ?, ?)";

        try (Connection connection = PostgressConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            for (String[] student : students) {
                preparedStatement.setString(1, student[0]); // Name
                preparedStatement.setInt(2, Integer.parseInt(student[1])); // Age
                preparedStatement.setString(3, student[2]); // Email

                preparedStatement.addBatch(); // Add to batch for batch execution
            }

            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}