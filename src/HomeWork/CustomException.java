package HomeWork;

import java.util.Objects;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter username: ");
        String username = input.nextLine();
        System.out.print("enter password: ");
        String password = input.nextLine();

        try {
            username(username);
            password(password);
            System.out.println("|>>   Welcome, " + username + "   |"); //if correct, show greeting.

        } catch (customException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static void username(String username) {
        String actualUsername = "himu"; //correct username
        if (!Objects.equals(username, actualUsername)) {
            throw new customException("incorrect username!");
        }
    }
    public static void password(String password) {
        String actualPassword = "123456"; //correct password
        if (!Objects.equals(password, actualPassword)) {
            throw new customException("incorrect password!");
        }
    }

    public static class customException extends RuntimeException {
        public customException(String message) {
            super(message);
        }
    }
}
