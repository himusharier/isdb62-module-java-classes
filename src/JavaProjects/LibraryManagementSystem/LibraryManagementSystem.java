package JavaProjects.LibraryManagementSystem;

import JavaProjects.LibraryManagementSystem.methods.ClearTerminal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        Member member = new Member();

        // main menu:
        while (true) {
            System.out.println("""
                    
                    >> Library Management System <<
                    -------------------------------
                    Main Menu:
                        1. Member Registration.
                        2. Borrow Book.
                        3. Return Book.
                        4. Search Book.
                        5. Add Book.
                        6. Remove Book.
                        0. Exit.
                    -------------------------------""");
            System.out.print("Choose an Option: ");
            int mainMenuOptions = input.nextInt();
            input.nextLine(); // added to solve auto input taking problem.
            ClearTerminal.clearTerminal();

            // switch for calling all the functionality.
            switch (mainMenuOptions) {
                case 1:
                    System.out.println("""
                            >> New Member Registration <<
                            -----------------------------""");
                    System.out.print("Enter Your Name: ");
                    String userName = input.nextLine();
                    System.out.println("""
                            Member Type:
                                1. Regular.
                                2. Student.""");
                    System.out.print("Choose Member Type: ");
                    int mtype = input.nextInt();
                    String memberType;
                    if (mtype == 1) {
                        memberType = "Regular";
                    } else {
                        memberType = "Student";
                    }
                    member.addNewMember(userName, memberType); // add new member.
                    ClearTerminal.clearTerminal();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("""
                            >> Search Book <<
                            -----------------""");
                    System.out.print("Enter Book Name or Author Name: ");
                    String bookOrAuthorName = input.nextLine();
                    book.searchBook(bookOrAuthorName);
                    ClearTerminal.clearTerminal();
                    break;
                case 5:
                    System.out.println("""
                            >> Add New Book <<
                            ------------------""");
                    System.out.print("Enter Book Name: ");
                    String bookName = input.nextLine();
                    System.out.print("Enter Author Name: ");
                    String authorName = input.nextLine();
                    System.out.print("Enter Number of Copies: ");
                    int copiesNumber = input.nextInt();
                    book.addBook(bookName, authorName, copiesNumber); // add new book.
                    ClearTerminal.clearTerminal();
                    break;
                case 6: // remove book:
                    System.out.println("""
                            >> Remove Book <<
                            -----------------""");
                    System.out.print("Enter Book Name: ");
                    String removeBookName = input.nextLine();
                    book.removeBook(removeBookName);
                    ClearTerminal.clearTerminal();
                    break;
                case 0: // exit:
                    System.out.println("""
                            >> Exit <<
                            ----------
                            Shutting down system...
                            """);
                    System.exit(1000); // exiting programme.
                    break;
            }
        }
    }
}
