**Library Management System**

**Problem Statement:**
Design and implement a **Library Management System** using Object-Oriented Programming (OOP) concepts to manage books, members, and transactions effectively.

**Requirements:**

1. **OOP Concepts:**
    - **Classes:** Create the following classes:
        - `Book`: To represent details like book title, author, and availability status.
        - `Member`: To represent member details like name, membership type, and borrowed books.
        - `Librarian`: To handle book issuance, returns, and overall library operations.
    - **Inheritance:**
        - Create subclasses `AdultMember` and `StudentMember` that inherit from the `Member` class.
        - Implement different borrowing policies for each subclass (e.g., maximum borrowable books or borrowing duration).
    - **Encapsulation:**
        - Ensure book and member details are private and accessible only via getters and setters.
    - **Polymorphism:**
        - Override borrowing policies in the `AdultMember` and `StudentMember` classes based on their membership type.

2. **Exception Handling:**
    - Implement the following custom exceptions:
        - `OverdueBookException`: Thrown when a member tries to borrow or return a book with overdue penalties.
        - `BookNotAvailableException`: Thrown when a member tries to borrow a book that is already issued to someone else.

3. **File I/O:**
    - Use file operations to:
        - Read initial data about books and members from CSV files.
        - Log transactions (e.g., book borrow/return) into a file for record-keeping.

**Tasks to Implement:**
- Write methods to add, remove, and search for books in the library.
- Implement member registration and maintain member data.
- Develop functionalities for borrowing and returning books while handling exceptions.
- Generate a transaction log after each operation, which includes the date, member ID, and book details.

**Expected Output:**
- A fully functional library system capable of handling book inventory, member transactions, and borrowing policies based on member types.
- Proper exception handling for errors like overdue books and unavailable books.
- Accurate logging of all transactions into a file for future reference.  