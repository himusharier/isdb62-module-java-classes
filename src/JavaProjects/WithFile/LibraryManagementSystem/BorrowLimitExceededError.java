package JavaProjects.WithFile.LibraryManagementSystem;

public class BorrowLimitExceededError extends RuntimeException {
    public BorrowLimitExceededError(String message) {
        super(message);
    }
}
