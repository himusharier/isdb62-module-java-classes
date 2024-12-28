package JavaProjects.LibraryManagementSystem;

import java.io.File;
import java.util.ArrayList;

public class Database {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> usernames = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<String> bookNames = new ArrayList<>();

    private File userFile = new File(Main.class.getClassLoader().getResource("src/JavaProjects/LibraryManagementSystem/data/users").getFile());
    private File booksFile = new File(Main.class.getClassLoader().getResource("src/JavaProjects/LibraryManagementSystem/data/books").getFile());

    public Database() {
        if (!userFile.exists()) {
            userFile.mkdir();
        }
        if (!booksFile.exists()) {
            booksFile.mkdir();
        }
    }

    public void AddUser(User s) {
        users.add(s);
        usernames.add(s.getName());
    }

    public int login(String phoneNumber, String email) {
        int n = -1;
        for (User s : users) {
            if (s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email)) {
                n = users.indexOf(s);
                break;
            }
        }
        return n;
    }

    public User getUser(int n) {
        return users.get(n);
    }

    public void addBook(Book book) {
        books.add(book);
        bookNames.add(book.getName());
    }

}
