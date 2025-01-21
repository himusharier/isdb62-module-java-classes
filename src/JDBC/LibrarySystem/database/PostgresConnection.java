package JDBC.LibrarySystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/himu_database";
    private static final String USER = "postgres";
    private static final String PASSWORD = "as324509";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
