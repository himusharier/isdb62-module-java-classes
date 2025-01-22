package JDBC.LibraryManagementConsoleApp.repository;

import JDBC.LibraryManagementConsoleApp.model.LibraryBooks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LibraryBooksRepositoryImpl implements LibraryBooksRepository {
    private Connection connection;

    public LibraryBooksRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<LibraryBooks> fetchAllBooks() {
        List<LibraryBooks> books = new ArrayList<>();
        String sql = "SELECT * FROM library_books_console_app ORDER BY id ASC";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                books.add(
                        new LibraryBooks( //creating objects.
                                resultSet.getInt("id"),
                                resultSet.getString("title"),
                                resultSet.getString("author"),
                                resultSet.getInt("year_of_publication"),
                                resultSet.getInt("number_of_pages"),
                                resultSet.getDouble("price"),
                                resultSet.getBoolean("availability")
                        ));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return books;
    }

    @Override
    public LibraryBooks fetchBookByTitle(int title) {
        return null;
    }

    @Override
    public boolean borrowBookByTitle(int title) {
        return false;
    }

    @Override
    public boolean returnBookByTitle(int title) {
        return false;
    }
}
