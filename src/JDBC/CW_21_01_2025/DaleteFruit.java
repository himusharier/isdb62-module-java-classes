package JDBC.CW_21_01_2025;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaleteFruit {
    private static final String URL = "jdbc:oracle:thin:@192.168.0.219:1521/ORCLPDB";
    private static final String USER = "orclpdbuser";
    private static final String PASSWORD = "isdb62";

    public static void main(String[] args) {
        String updateSql = "UPDATE himu_jdbc_practice SET name = ? WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);

            preparedStatement.setString(1, "Himu");
            preparedStatement.setString(2, "14");

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("record updated!");
            } else {
                System.out.println("no record updated");
            }

        } catch (SQLException e) {
            System.err.println("Error updating data: " + e.getMessage());
        }

    }
}
