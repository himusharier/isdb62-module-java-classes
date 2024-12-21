package Class_21_12_2024.throwCatch;

public class TestThrow {
    public static void main(String[] args) {
        TestThrow testThrow = new TestThrow();
        double v1 = testThrow.divideTwoNumber(123, 343);
        double v2 = testThrow.divideTwoNumber(123, 0);

        System.out.println(v1);
        System.out.println(v2);
    }

    public double divideTwoNumber(double num1, double num2) {
        double v = num1 / num2;

        try {
            v = num1 / num2;
        } catch (Exception e) {
            throw new ArithmeticException("given wrong input and it caused error. error is: " + e.getMessage());
        }
        return v;
    }
}
