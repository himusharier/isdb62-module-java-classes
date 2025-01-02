package ClassLectures.nineteenthClass;

import java.util.HashMap;
import java.util.Map;

public class FibonacciOptimized {
    // Recursive method with memoization
    private static Map<Long, Long> memo = new HashMap<>();

    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }

        // Check if the result is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute and store the result
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 49; // Term of the Fibonacci series to print
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}
