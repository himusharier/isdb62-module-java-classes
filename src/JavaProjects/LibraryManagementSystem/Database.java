package JavaProjects.LibraryManagementSystem;

import java.io.*;
import java.util.ArrayList;

public class Database {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> usernames = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<String> bookNames = new ArrayList<>();

    private File userFile = new File("src/JavaProjects/LibraryManagementSystem/data/users");
    private File booksFile = new File("src/JavaProjects/LibraryManagementSystem/data/books");

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
        saveUsers();
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

    private void getUsers() {
        String text1 = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(userFile));
            String s1;
            while ((s1 = br1.readLine()) != null) {
                text1 = text1 + s1;
            }
            br1.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        if (!text1.matches("") || !text1.isEmpty()) {
            String[] a1 = text1.split("<NewUser/>");

            for (String s : a1) {
                String[] a2 = s.split("<N/>");
                if (a2[3].matches("Admin")) {
                    User user = new Admin(a2[0], a2[1], a2[2]);
                    AddUser(user);
                } else {
                    User user = new NormalUser(a2[0], a2[1], a2[2]);
                    AddUser(user);
                }
            }
        }
    }

    private void saveUsers() {
        String text1 = "";
        for (User user : users) {
            text1 = text1 + users.toString() + "<NewUser/>\n";
        }
        try {
            PrintWriter pw = new PrintWriter(userFile);
            pw.print(text1);
            pw.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}
