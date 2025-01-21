package JDBC.LibrarySystem.model;

import java.util.Date;

public class LibraryBooks {
    private int book_id;
    private String title;
    private String author;
    private String genre;
    private int published_year;
    private boolean available;

    //constructor:
    public LibraryBooks(int book_id, String title, String author, String genre, int published_year, boolean available) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.published_year = published_year;
        this.available = available;
    }

    //print all data:
    public String libraryBooksPrint() {
        return String.format("%-3d %-25s %-25s %-25s %-15s", book_id, title, author, genre, published_year);
    }

    //setter:
    public void setAvailable(boolean available) {
        this.available = available;
    }

    //getter:
    public int getBook_id() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublished_year() {
        return published_year;
    }

    public boolean isAvailable() {
        return available;
    }
}
