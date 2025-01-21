package JDBC.LibrarySystemV2.model;

public class Book {
    public int id;
    public String title;
    public String author;
    public String genre;
    public int publishedYear;
    public boolean available;

    public Book(int id, String title, String author, String genre, int publishedYear, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedYear = publishedYear;
        this.available = available;
    }

    public void libraryBooksPrint() {
        System.out.printf("%-3d %-25s %-25s %-25s %-15s%n", id, title, author, genre, publishedYear);
    }
}
