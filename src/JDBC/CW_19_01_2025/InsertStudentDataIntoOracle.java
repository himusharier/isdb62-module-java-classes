package JDBC.CW_19_01_2025;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentDataIntoOracle {
    /*private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";*/

    private static final String URL = "jdbc:oracle:thin:@192.168.0.219:1521/ORCLPDB";
    private static final String USER = "orclpdbuser";
    private static final String PASSWORD = "isdb62";

    public void insertDummyData(String[][] students) throws SQLException {
        String insertQuery = "INSERT INTO himu_jdbc_practice (name, age, email) VALUES (?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            for (String[] student : students) {
                preparedStatement.setString(1, student[0]);
                preparedStatement.setInt(2, Integer.parseInt(student[1]));
                preparedStatement.setString(3, student[2]);

                preparedStatement.addBatch();
            }

            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}
