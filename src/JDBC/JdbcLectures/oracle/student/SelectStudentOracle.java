package JDBC.JdbcLectures.oracle.student;



import JDBC.JdbcLectures.oracle.OracleConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudentOracle {

    public void selectAllStudents() {
        String selectQuery = "SELECT * FROM studentjdbc";

        try (Connection connection = OracleConnection.getConnection();
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