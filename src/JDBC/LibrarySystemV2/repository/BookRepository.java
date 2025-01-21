package JDBC.LibrarySystemV2.repository;

import JDBC.LibrarySystemV2.model.Book;

import java.util.List;

public interface BookRepository {
    Book findBookById(int id);
    List<Book> findAll();
    boolean updateBook(Book book);
    boolean deleteBookById(int id);
}
