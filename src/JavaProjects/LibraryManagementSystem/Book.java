package JavaProjects.LibraryManagementSystem;

import JavaProjects.LibraryManagementSystem.methods.AddNewBookToTheDatabase;
import JavaProjects.LibraryManagementSystem.methods.PauseTerminal;
import JavaProjects.LibraryManagementSystem.methods.RemoveBookFromDatabase;
import JavaProjects.LibraryManagementSystem.methods.SearchBookFromDatabase;

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
                \u001B[32m>> New book added successfully!\u001B[0m
                ---------------------------------""");
        PauseTerminal.pauseTerminal();
    }

    // remove-book method:
    public void removeBook(String removeBookID) throws FileNotFoundException {
        // read books-list, find book-name, skip this record, print others.
        RemoveBookFromDatabase.removeBookFromDatabase(removeBookID);
        PauseTerminal.pauseTerminal();
    }

    // search-book method:
    public void searchBook(String booksOrAuthors) throws FileNotFoundException {
        // read books-list, create arraylist, search with contains clause, if found show all names.
        System.out.println();
        SearchBookFromDatabase.searchBookFromDatabase(booksOrAuthors);
        PauseTerminal.pauseTerminal();
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
