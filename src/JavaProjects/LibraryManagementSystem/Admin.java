package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class Admin extends User{

    public Admin(String name) {
        super(name);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);

        this.operations = new IOOperation[] {
                new ViewBooks(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    @Override
    public void menu(Database database, User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                >> Admin Menu:
                  1) View Books
                  2) Add Books
                  3) Delete Books
                  4) Search
                  5) Delete All Data
                  6) View Orders
                  0) Exit
                """);
        System.out.print("Choose an option: ");
        int adminOption = scanner.nextInt();
        this.operations[adminOption-1].oper(database, user);
        scanner.close();
    }

    public String toString() {
        return name + " " + email + " " + phoneNumber + " " + "Admin";
    }

}
