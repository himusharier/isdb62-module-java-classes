package JDBC.CW_28_01_2025;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    //postgres database connection:
    private static final String URL = "jdbc:postgresql://localhost:5432/himu_database";
    private static final String USER = "postgres";
    private static final String PASSWORD = "isdb62";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
