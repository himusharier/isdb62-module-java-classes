package JDBC.CW_19_01_2025;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBookPublicationDataIntoPostgres {
    private static final String URL = "jdbc:postgresql://localhost:5432/himu_database";
    private static final String USER = "postgres";
    private static final String PASSWORD = "as324509";

    public static void main(String[] args) throws SQLException {
        String[][] books = {
                {"The Great Adventure", "John Doe", "Adventure", "19.99", "2020-05-15"},
                {"Mastering Oracle SQL", "Jane Smith", "Technical", "39.95", "2018-08-23"},
                {"Science of Life", "Emily Green", "Science", "29.50", "2021-11-30"},
                {"Fantasy World", "Michael Black", "Fantasy", "24.99", "2019-03-10"},
                {"Love and War", "Sarah White", "Romance", "15.75", "2022-01-05"}
        };

        InsertBookPublicationDataIntoPostgres postgres = new InsertBookPublicationDataIntoPostgres();
        postgres.insertDummyDataBookPostgres(books);
    }

    public static void insertDummyDataBookPostgres(String[][] books) throws SQLException {
        String insertQuery = "INSERT INTO himu_jdbc_practice (book_name, book_author, book_genre, book_price, book_publish_date) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            for (String[] book : books) {
                preparedStatement.setString(1, book[0]);
                preparedStatement.setString(2, book[1]);
                preparedStatement.setString(3, book[2]);
                preparedStatement.setDouble(4, Double.parseDouble(book[3]));
                preparedStatement.setDate(5, Date.valueOf(book[4]));

                preparedStatement.addBatch();
            }

            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}
