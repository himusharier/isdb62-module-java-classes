package JDBC.LibraryManagementConsoleApp.model;

public class LibraryBooks {
    private int id;
    private String title;
    private String author;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;
    private boolean availabilityStatus;

    //constructor:
    public LibraryBooks(int id, String title, String author, int yearOfPublication, int numberOfPages, double price, boolean availabilityStatus) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    public void libraryBooksPrint() {
        System.out.printf("%-3s %-25s %-25s %20s %8s %8.2f %n", id, title, author, yearOfPublication, numberOfPages, price);
    }

}
