package JDBC.JdbcLectures;

import Model.Book;
import oracle.book.BookDAO;
import oracle.student.SelectStudentOracle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[][] students = {
                {"John Doe", "20", "john.doe@example.com"},
                {"Jane Smith", "22", "jane.smith@example.com"},
                {"Alice Johnson", "19", "alice.johnson@example.com"},
                {"Bob Brown", "21", "bob.brown@example.com"}
        };

//        InsertStudentData postgreSql = new InsertStudentData();
//        postgreSql.insertDummyData(students);

//        oracle.student.InsertStudentOracle oracle = new oracle.student.InsertStudentOracle();
//        oracle.insertDummyData(students);

//        SelectStudentOracle selectStudentOracle = new SelectStudentOracle();
//        selectStudentOracle.selectAllStudents();

        List<Book> books = new ArrayList<>();

        books.add(new Book("Effective Java", "Joshua Bloch", 45.99, true));
        books.add(new Book("Clean Code", "Robert C. Martin", 39.95, true));
        books.add(new Book("Java: The Complete Reference", "Herbert Schildt", 55.00, true));
        books.add(new Book("Head First Java", "Kathy Sierra", 29.99, true));
        books.add(new Book("Spring in Action", "Craig Walls", 49.99, true));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 42.00, true));
        books.add(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma", 58.50, true));
        books.add(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 47.99, true));
        books.add(new Book("Java Concurrency in Practice", "Brian Goetz", 39.99, true));
        books.add(new Book("Introduction to Algorithms", "Thomas H. Cormen", 65.00, true));

        BookDAO dao = new BookDAO();
        for (Book book : books)
            dao.addBook(book);
    }
}