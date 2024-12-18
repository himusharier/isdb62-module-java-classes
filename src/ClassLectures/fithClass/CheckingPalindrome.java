package ClassLectures.fithClass;

import java.util.Scanner;

public class CheckingPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String : ");
        String string = scanner.nextLine();
        int low = 0;
        int high = string.length() - 1;

        boolean isPalindrome = true;

        while (low < high) {
            if (string.charAt(low) != string.charAt(high)) {
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
