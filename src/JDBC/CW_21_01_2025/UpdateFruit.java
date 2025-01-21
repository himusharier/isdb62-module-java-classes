package JDBC.CW_21_01_2025;

import java.sql.*;

public class UpdateFruit {
    private static final String URL = "jdbc:oracle:thin:@192.168.0.219:1521/ORCLPDB";
    private static final String USER = "orclpdbuser";
    private static final String PASSWORD = "isdb62";

    public static void main(String[] args) {
        String updateSql = "DELETE FROM himu_jdbc_practice WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);

            preparedStatement.setString(1, "14");

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("record deleted!");
            } else {
                System.out.println("no record deleted");
            }

        } catch (SQLException e) {
            System.err.println("Error deleting data: " + e.getMessage());
        }

    }
}
