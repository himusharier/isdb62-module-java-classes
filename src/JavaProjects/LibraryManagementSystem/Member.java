package JavaProjects.LibraryManagementSystem;

public class Member {
    private String name;
    private String membershipType; // regular, student
    private String borrowedBooks;

    // constructors:
    public Member() {};
    public Member(String name, String membershipType, String borrowedBooks) {
        this.name = name;
        this.membershipType = membershipType;
        this.borrowedBooks = borrowedBooks;
    }

    // member-registration method:
    public void addNewMember(String userName, String membershipType) {
        // write into member-list file.
    }

    // borrow-book method:
    public void borrowBook(int memberId, int bookId) {
        // assign book-id with member-id, insert into library-log
    }

    // return-book method:
    public void returnBook(int memberId, int bookId) {
        // change into member-list, book-list copies and library-log
    }

    // getters and setters:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMembershipType() {
        return membershipType;
    }
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
    public String getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
