package JDBC.LibrarySystem.service;

import JDBC.LibrarySystem.model.LibraryBooks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static JDBC.LibrarySystem.database.PostgresConnection.getConnection;

public class DBOperations {

    //get single book date:
    public LibraryBooks getSingleBook(int book_id) {
        String sql = "SELECT * FROM library_system WHERE book_id = ?";
        try (Connection db = getConnection(); PreparedStatement query = db.prepareStatement(sql)) {
            query.setInt(1, book_id);
            ResultSet data = query.executeQuery();
            if (data.next()) {
                return new LibraryBooks( //create single object and return.
                        data.getInt("book_id"),
                        data.getString("title"),
                        data.getString("author"),
                        data.getString("genre"),
                        data.getInt("published_year"),
                        data.getBoolean("available"));
            }
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
        return null;
    }

    //get all books data:
    public List<LibraryBooks> getAllBooks() {
        List<LibraryBooks> books = new ArrayList<>();
        String sql = "SELECT * FROM library_system ORDER BY book_id ASC";
        try (Connection db = getConnection(); Statement query = db.createStatement(); ResultSet data = query.executeQuery(sql)) {
            while (data.next()) {
                books.add(
                        new LibraryBooks( //creating objects.
                        data.getInt("book_id"),
                        data.getString("title"),
                        data.getString("author"),
                        data.getString("genre"),
                        data.getInt("published_year"),
                        data.getBoolean("available")));
            }
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
        return books;
    }

    //get all books data:
    public List<LibraryBooks> getBorrowedBooks() {
        List<LibraryBooks> books = new ArrayList<>();
        String sql = "SELECT * FROM library_system WHERE available = false ORDER BY book_id ASC";
        try (Connection db = getConnection(); Statement query = db.createStatement(); ResultSet data = query.executeQuery(sql)) {
            while (data.next()) {
                books.add(
                        new LibraryBooks( //creating objects.
                        data.getInt("book_id"),
                        data.getString("title"),
                        data.getString("author"),
                        data.getString("genre"),
                        data.getInt("published_year"),
                        data.getBoolean("available")));
            }
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
        return books;
    }

    //borrow a book:
    public void borrowABook(int book_id) {
        String status = "";
        LibraryBooks book = getSingleBook(book_id);
        if (book.isAvailable()) {
            String sql = "UPDATE library_system SET available = false WHERE book_id = ?";
            try (Connection db = getConnection(); PreparedStatement query = db.prepareStatement(sql)) {
                query.setInt(1, book_id);
                int respond = query.executeUpdate();
                if (respond > 0) {
                    System.out.println("\u001B[32mBook: '" + book.getTitle() + "' is ready to borrow!\u001B[0m");
                }
            } catch (SQLException e) {
                System.err.println("Error " + e.getMessage());
            }

        } else {
            System.out.println("\u001B[31mBook: '" + book.getTitle() + "' is not available to borrow!\u001B[0m");
        }
    }

    //return a book:
    public void returnABook(int book_id) {
        String status = "";
        LibraryBooks book = getSingleBook(book_id);
        if (!book.isAvailable()) {
            String sql = "UPDATE library_system SET available = 'false' WHERE book_id = ?";
            try (Connection db = getConnection(); PreparedStatement query = db.prepareStatement(sql)) {
                query.setInt(1, book_id);
                int respond = query.executeUpdate();
                if (respond > 0) {
                    System.out.println("\u001B[32mBook: '" + book.getTitle() + "' is returned!\u001B[0m");
                }
            } catch (SQLException e) {
                System.err.println("Error " + e.getMessage());
            }

        } else {
            System.out.println("\u001B[31mBook: '" + book.getTitle() + "' is not available to borrow!\u001B[0m");
        }
    }
}
