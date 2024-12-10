package Class_05_12_2024;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word or number to check palindrome: ");
        String wordOrNumber = input.nextLine();

        int startIndx = 0;
        int endIndx = wordOrNumber.length() - 1;
        boolean isPalindrome = true;

        /*while (startIndx < endIndx) {
            if (wordOrNumber.charAt(startIndx) != wordOrNumber.charAt(endIndx)) {
                isPalindrome = false;
                break;
            }
            startIndx++;
            endIndx--;
        }*/
        for (startIndx = 0; startIndx < endIndx; startIndx++, endIndx--) {
            if (wordOrNumber.charAt(startIndx) != wordOrNumber.charAt(endIndx)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: " + wordOrNumber + " is palindrome.");
        } else {
            System.out.println("Result: " + wordOrNumber + " is not palindrome.");
        }
    }
}
