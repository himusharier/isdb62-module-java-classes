package JDBC.LibrarySystemV2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/himu_database";
    private static final String USER = "postgres";
    private static final String PASSWORD = "as324509";

    private static Connection connection;

    public Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;

    }
}

