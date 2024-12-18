package ClassLectures.thirdClass;

import java.util.Scanner;

public class PrimeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        // int i, m = n / 2,  flag = 0;
        int i;
        int m = n / 2;
        boolean flag = false;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(n + " is prime number");
            }
        }
    }
}