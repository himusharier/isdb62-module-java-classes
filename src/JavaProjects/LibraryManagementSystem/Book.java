package JavaProjects.LibraryManagementSystem;

import JavaProjects.LibraryManagementSystem.methods.AddNewBookToTheDatabase;

import java.io.FileNotFoundException;

public class Book {
    private String title;
    private String author;
    private int numberOfCopies;

    // constructors:
    public Book() {}
    public Book(String title, String author, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
    }

    // add-book method:
    public void addBook(String bookName, String authorName, int copiesNumber) throws FileNotFoundException {
        // read books-list file and add new book at the end with incremented book-id.
        AddNewBookToTheDatabase.addNewBookToTheDatabase(bookName, authorName, copiesNumber);
        System.out.println("""
                >> New book added successfully!
                ---------------------------------""");
    }

    // remove-book method:
    public void removeBook(int bookId) {
        // read books-list, find book-id, skip this record, print others.

    }

    // search-book method:
    public void searchBook(String booksOrAuthors) {
        // read books-list, create arraylist, search with contains clause, if found show all names.
    }

    // getters and setters:
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int isNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
