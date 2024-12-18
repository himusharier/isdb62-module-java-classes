package ClassLectures.sixthClass;

import java.util.Random;

public class MainPassword {
    public static void main(String[] args) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String specialCharacter = "!@#$%^&*)(<>?.,";
        String combination = upperCase + lowerCase + number + specialCharacter;
        int passwordLength = 8;

        char[] password = new char[passwordLength];

        Random iqram = new Random();

        for (int i = 0; i < passwordLength; i++) {
            int length = combination.length();
            // System.out.println("Length of combination " + length);
            int index = iqram.nextInt(length);
            System.out.println("Value of index " + index);


            password[i] = combination.charAt(index);
        }
        System.out.println("Generate password is : " + new String(password));
    }
}
