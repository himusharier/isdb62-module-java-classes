package JDBC.LibrarySystemV2.repository;

import JDBC.LibrarySystemV2.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private Connection connection;

    private static final String FIND_BY_ID_QUERY = "SELECT * FROM library_system WHERE book_id = ?";
    private static final String FIND_ALL_QUERY = "SELECT * FROM library_system ORDER BY book_id ASC";
    private static final String UPDATE_BOOK_QUERY = "UPDATE library_system SET title = ?, author = ?, genre = ?, published_year = ?, available = ? WHERE book_id = ?";
    private static final String DELETE_BOOK_QUERY = "DELETE FROM library_system WHERE book_id = ?";

    public BookRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Book findBookById(int id) {
        try (PreparedStatement statement = connection.prepareStatement(FIND_BY_ID_QUERY)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return mapResultSetToBook(resultSet);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(FIND_ALL_QUERY);
            while (resultSet.next()) {
                books.add(mapResultSetToBook(resultSet));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return books;
    }

    @Override
    public boolean updateBook(Book book) {
        try (PreparedStatement statement = connection.prepareStatement(UPDATE_BOOK_QUERY)) {
            statement.setString(1, book.title);
            statement.setString(2, book.author);
            statement.setString(3, book.genre);
            statement.setInt(4, book.publishedYear);
            statement.setBoolean(5, book.available);
            statement.setInt(6, book.id);

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }

    @Override
    public boolean deleteBookById(int id) {
        try (PreparedStatement statement = connection.prepareStatement(DELETE_BOOK_QUERY)) {
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }

    private Book mapResultSetToBook(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("book_id");
        String title = resultSet.getString("title");
        String author = resultSet.getString("author");
        String genre = resultSet.getString("genre");
        int publishedYear = resultSet.getInt("published_year");
        boolean available = resultSet.getBoolean("available");
        return new Book(id, title, author, genre, publishedYear, available);
    }
}
