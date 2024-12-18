package ClassLectures.eleventhClass;

import java.util.Scanner;

public class KeithNumberAltered {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt(); // 197
        String s = Integer.toString(n); // "197"
        int d = s.length(); // 3
        int[] arr = new int[n];
        // int[] test = {1,9,7,17,33,57....107..}
        int i, sum;

        for (i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0'; // Convert character to its integer value
        }

        i = d; // 6
        sum = 0;

        while (sum < n) {
            sum = 0;
            for (int j = 1; j <= d; j++) {
                sum = sum + arr[i - j];
            }
            arr[i] = sum;
            i++;
        }

        if (sum == n)
            System.out.println("Keith Number");
        else
            System.out.println("Not a Keith Number");
    }
}
