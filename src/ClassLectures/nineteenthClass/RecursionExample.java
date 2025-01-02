package ClassLectures.nineteenthClass;

public class RecursionExample {
    public static void main(String[] args) {
        int sum = sum(5);
        System.out.println(sum);

        int multiplication = multiplication(10);
        System.out.println(multiplication);
    }

    // Sum up to n with recursion
    public static int sum(int n) { // 2, 1, 0
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int multiplication(int n) { // 2, 1, 0
        if (n > 1) {
            return multiplication(n - 1) * n;
        }
        return n;
    }

    // Sum up to n with for loop
    public static int sumTwo(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

