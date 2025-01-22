package JDBC.LibraryManagementConsoleApp.repository;

import JDBC.LibraryManagementConsoleApp.model.LibraryBooks;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        String sql = "SELECT * FROM library_books_console_app";
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
    public LibraryBooks fetchBookByTitle(String title) {
        LibraryBooks book = new LibraryBooks();
        String sql = "SELECT * FROM library_books_console_app WHERE title = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, title);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                book = new LibraryBooks( //creating objects.
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("author"),
                        resultSet.getInt("year_of_publication"),
                        resultSet.getInt("number_of_pages"),
                        resultSet.getDouble("price"),
                        resultSet.getBoolean("availability")
                );
                return book;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public boolean borrowBookByTitle(String title) {
        LibraryBooks book = fetchBookByTitle(title);
        if (book != null) {
            if (book.getAvailabilityStatus()) {
                String sql = "UPDATE library_books_console_app SET availability = false WHERE title = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, title);
                    int rowsUpdated = statement.executeUpdate();
                    return rowsUpdated > 0; // true (if it works)
                } catch (SQLException e) {
                    e.getMessage();
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean returnBookByTitle(String title) {
        LibraryBooks book = fetchBookByTitle(title);
        if (book != null) {
            if (!book.getAvailabilityStatus()) {
                String sql = "UPDATE library_books_console_app SET availability = true WHERE title = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, title);
                    int rowsUpdated = statement.executeUpdate();
                    return rowsUpdated > 0; // true (if it works)
                } catch (SQLException e) {
                    e.getMessage();
                }
            }
            return false;
        }
        return false;
    }
}
