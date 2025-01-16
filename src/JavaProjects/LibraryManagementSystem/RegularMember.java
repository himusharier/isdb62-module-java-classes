package JavaProjects.LibraryManagementSystem;

public class RegularMember extends Member {
    private int borrowableBooks = 5;

    // constructors:
    public RegularMember(String name, String membershipType, String borrowedBooks) {
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
