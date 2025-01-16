### Problem Statement:

Design and implement a simple Library Management System (LMS) using Object-Oriented Programming (OOP) concepts. The system should manage books, members, and transactions like borrowing and returning books.

### Requirements:

**1. Classes:**
- **Book:** A class to represent a book with attributes such as title, author, and availability status.
- **Member:** A class to represent a member with details like name, membership type (Regular or Student), and borrowed books.

**2. Subclasses:**
- **RegularMember:** A subclass of Member that allows members to borrow up to 5 books.
- **StudentMember:** A subclass of Member that allows members to borrow up to 3 books.

**3. Methods:**
- **Add Book:** A method to add new books to the library.
- **Remove Book:** A method to remove books from the library.
- **Search Book:** A method to search for books by title or author.
- **Borrow Book:** A method to borrow a book (ensure the book is available).
- **Return Book:** A method to return borrowed books.

**4. Simple Error Handling:**
- **BookNotAvailableError:** Display an error message when a book is already borrowed by someone else.
- **BorrowLimitExceededError:** Display an error message when a member tries to borrow more books than allowed.

**5. File Operations:**
- **Transaction Logging:** After each borrowing or returning operation, log the transaction details into a file (e.g., member name, book title, and action).

### Tasks:

1. Create the **Book** and **Member** classes, and the **RegularMember** and **StudentMember** subclasses.
2. Implement methods to add, remove, and search books.
3. Implement borrowing and returning of books, considering the borrowing limits for Regular and Student members.
4. Log each transaction into a file for record-keeping.

### Expected Output:

The system should be able to:
- Add, remove, and search for books.
- Register members and allow them to borrow and return books.
- Ensure members cannot borrow more than their allowed number of books.
- Log all transactions after each operation.

