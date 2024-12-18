package ClassLectures.sixthClass;

import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        if (length < 6) {
            System.out.println("Password length should be at least 6 characters for better security.");
        } else {
            String password = generatePassword(length);
            System.out.println("Generated Password: " + password);
        }

        scanner.close();
    }


    public static String generatePassword(int length) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        String allChars = lowerCase + upperCase + digits + specialChars;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));


        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return shuffleString(password.toString());
    }


    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();

        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
}