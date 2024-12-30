package ClassPracticeFiles.Class_30_12_2024;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(4));
        System.out.println(factorialValue(5));
    }

    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int factorialValue(int m) {
        if (m > 1) {
            return factorialValue(m - 1) * m;
        }
        return m;
    }

}
