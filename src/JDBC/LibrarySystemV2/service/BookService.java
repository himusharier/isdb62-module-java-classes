package JDBC.LibrarySystemV2.service;

import JDBC.LibrarySystemV2.model.Book;
import JDBC.LibrarySystemV2.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void borrowBook(int id) {
        Book book = getBook(id);
        if (book.available) {
            book.available = false;
            boolean status = bookRepository.updateBook(book);
            if (status) {
                System.out.println("book is borrowed successfully");
            } else {
                System.out.println("failed to borrow book");
            }
        } else {
            System.out.println("book is already borrowed");
        }

    }

    public void returnBook(int id) {
        Book book = getBook(id);
        if (book.available) {
            System.out.println("book not borrowed yet!");
        } else {
            book.available = true;
            boolean status = bookRepository.updateBook(book);
            if (status) {
                System.out.println("book is returned successfully");
            } else {
                System.out.println("failed to return book");
            }
        }
    }

    private Book getBook(int id) {
        Book book = bookRepository.findBookById(id);
        if (book == null) {
            System.out.println("book not found");
        }
        return book;
    }

}
