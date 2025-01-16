package JavaProjects.LibraryManagementSystem;

public class BookNotAvailableError extends RuntimeException {
    public BookNotAvailableError(String message) {
        super(message);
    }
}
