package JavaProjects.WithFile.LibraryManagementSystem;

import JavaProjects.WithFile.LibraryManagementSystem.methods.ClearTerminal;
import JavaProjects.WithFile.LibraryManagementSystem.methods.ShowBookList;

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
                    
                    \u001B[33m>> Library Management System <<\u001B[0m
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
                            \u001B[33m>> New Member Registration <<\u001B[0m
                            -----------------------------""");
                    System.out.print("Enter Your Name: ");
                    String userName = input.nextLine();
                    System.out.println("""
                            Member Type:
                                1. Regular.
                                2. Student.""");
                    System.out.print("Choose Member Type: ");
                    int memberTypeOption = input.nextInt();
                    String memberType;
                    if (memberTypeOption == 2) {
                        memberType = "Student";
                    } else {
                        memberType = "Regular";
                    }
                    member.addNewMember(userName, memberType); // add new member.
                    ClearTerminal.clearTerminal();
                    break;
                case 2: // borrow book:
                    System.out.println("""
                            \u001B[33m>> Borrow A Book <<\u001B[0m
                            -----------------""");
                    System.out.print("Enter Your Name: ");
                    String borrowMemberName = input.nextLine();
                    System.out.print("Enter Book Name: ");
                    String borrowBookName = input.nextLine();
                    member.borrowBook(borrowMemberName, borrowBookName);
                    ClearTerminal.clearTerminal();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("""
                            \u001B[33m>> Search Book <<\u001B[0m
                            -----------------""");
                    System.out.println("Enter Book Name or Author Name (Left blank");
                    System.out.print("will show book lists): ");
                    String bookOrAuthorName = input.nextLine();
                    book.searchBook(bookOrAuthorName);
                    ClearTerminal.clearTerminal();
                    break;
                case 5:
                    System.out.println("""
                            \u001B[33m>> Add New Book <<\u001B[0m
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
                            \u001B[33m>> Remove Book <<\u001B[0m
                            -----------------""");
                    ShowBookList.showBookList();
                    System.out.print("Enter Book ID to Remove: ");
                    String removeBookID = input.nextLine();
                    book.removeBook(removeBookID);
                    ClearTerminal.clearTerminal();
                    break;
                case 0: // exit:
                    System.out.println("""
                            \u001B[31m>> Exit <<\u001B[0m
                            ----------
                            Shutting down system...
                            """);
                    System.exit(1000); // exiting programme.
                    break;
            }
        }
    }
}
