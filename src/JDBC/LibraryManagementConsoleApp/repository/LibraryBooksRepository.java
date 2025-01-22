package JDBC.LibraryManagementConsoleApp.repository;

import JDBC.LibraryManagementConsoleApp.model.LibraryBooks;

import java.util.List;

public interface LibraryBooksRepository {
    List<LibraryBooks> fetchAllBooks(); //get all book list
    LibraryBooks fetchBookByTitle(String title);
    boolean borrowBookByTitle(String title); //borrow book by title, return true if borrow success.
    boolean returnBookByTitle(String title); //return book by title, return true if return success.
}
