package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    public NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    @Override
    public void menu(Database database, User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                >> User Menu:
                  1) View Books
                  2) Search
                  3) Place Order
                  4) Borrow Books
                  5) Calculate Fine
                  6) Return Books
                  0) Exit
                """);
        System.out.print("Choose an option: ");
        int adminOption = scanner.nextInt();
        this.operations[adminOption-1].oper(database, user);
        scanner.close();
    }

    public String toString() {
        return name + " " + email + " " + phoneNumber + " " + "Normal";
    }

}
