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
    public LibraryBooks() {
    }
    public LibraryBooks(
            int id,
            String title,
            String author,
            int yearOfPublication,
            int numberOfPages,
            double price,
            boolean availabilityStatus
    ) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    //getter:
    public boolean getAvailabilityStatus() {
        return availabilityStatus;
    }

    //method to print the records:
    public void libraryBooksPrint() {
        System.out.printf("%-25s %-25s %20s %8s %8.2f%n", title, author, yearOfPublication, numberOfPages, price);
    }

}
