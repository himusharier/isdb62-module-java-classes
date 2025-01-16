package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        Member member = new Member();

        // main menu:
        while (true) {
            System.out.println("""
                    
                    >> Library Management System <<
                    -------------------------------
                    Choose an option:
                        1. Member Registration.
                        2. Borrow Book.
                        3. Return Book.
                        4. Add book.
                        0. Exit.
                    -------------------------------""");
            int mainMenuOptions = input.nextInt();

            // switch for calling all the functionality.
            switch (mainMenuOptions) {
                case 1:
                    System.out.println("""
                            
                            >> New Member Registration <<
                            -----------------------------""");
                    System.out.print("Enter Your Name: ");
                    String userName = input.nextLine();
                    System.out.print("Enter Member Type (Regular/Student): ");
                    String memberType = input.nextLine();
                    member.addNewMember(userName, memberType);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("""
                            
                            >> Add New Book <<
                            ------------------""");
                    System.out.print("Enter Book Name: ");
                    String bookName = input.nextLine();
                    System.out.print("Enter Author Name: ");
                    String authorName = input.nextLine();
                    book.addBook(bookName, authorName);
                    break;
                case 0:
                    System.out.println("""
                            
                            >> Exit <<
                            ----------
                            Shutting down system...
                            """);
                    System.exit(1000);
                    break;
            }
        }
    }
}
