package ClassLectures.nineteenthClass;

public class Fibonacci {

    // Recursive method to calculate Fibonacci number
    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        long n = 5; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (long i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

