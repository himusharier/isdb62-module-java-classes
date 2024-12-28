package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static Database database;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        database = new Database();

        int mainMenu;
        System.out.print("""
                ---------------------------------------------
                    Welcome to Library Management System!
                ---------------------------------------------
                """);
        do {
            System.out.print("""
                >> Main Menu:
                  1) Login
                  2) New User
                  0) Exit
                -----------------
                """);
            System.out.print("Choose an option: ");
            mainMenu = scanner.nextInt();

            switch (mainMenu) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
            }

        } while (mainMenu != 0);
    }

    private static void login() {
        System.out.println();
        System.out.println("--------- User Login ----------");
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.next();
        System.out.print("Enter email: ");
        String email = scanner.next();

        int n = database.login(phoneNumber, email);
        if (n != -1) {
            User user = database.getUser(n);
            System.out.println("#>> Welcome, " + user.getEmail());
            System.out.println();
            user.menu(database, user);
        } else {
            System.out.println("#>> error: user not found! <<");;
            System.out.println();
        }
    }

    private static void newUser() {
        System.out.println();
        System.out.println("--------- Creating New User ----------");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.next();
        System.out.print("Enter email: ");
        String email = scanner.next();
        System.out.print("User type: 1) Admin, 2) Normal User => ");
        int userType = scanner.nextInt();

        User user = null;
        if (userType == 1) {
            user = new Admin(name, email, phoneNumber);
        } else if (userType == 2) {
            user = new NormalUser(name, email, phoneNumber);
        } else {
            System.out.println("#>> error: wrong input! <<");
            System.out.println();
            System.exit(404);
        }
        database.AddUser(user);
        System.out.println("#>> User created successfully! <<");
        System.out.println();
    }
}
