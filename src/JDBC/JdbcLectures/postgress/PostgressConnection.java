package JDBC.JdbcLectures.postgress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgressConnection {
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres"; // Replace with your DB URL
    public static final String USER = "postgres"; // Replace with your DB username
    public static final String PASSWORD = "postgres"; // Replace with your DB password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
