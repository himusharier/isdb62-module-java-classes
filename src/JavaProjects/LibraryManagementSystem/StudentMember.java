package JavaProjects.LibraryManagementSystem;

public class StudentMember extends Member {
    private int borrowableBooks = 3;

    // constructors:
    public StudentMember(String name, String membershipType, String borrowedBooks) {
        super(name, membershipType, borrowedBooks);
    }

    // override borrow-book and return-book to use borrowable value.
    @Override
    public void borrowBook(int memberId, int bookId) {
        super.borrowBook(memberId, bookId);
    }
    @Override
    public void returnBook(int memberId, int bookId) {
        super.returnBook(memberId, bookId);
    }
}
