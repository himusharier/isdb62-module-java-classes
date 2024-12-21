package ClassLectures.thirteenthClass.learnThrow;

public class TestThrow {
    public static void main(String[] args) {
        TestThrow testThrow = new TestThrow();

        double v = testThrow.divideTwoNumber(1234, 3465);
        double v1 = testThrow.divideTwoNumber(122, 0);

        try {
            int[] arr = {1, 2, 3};
            int randomElement = testThrow.accessRandomElement(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Here is the exception " + e.getMessage());
        }

    }

    public double divideTwoNumber(double num1, double num2) {
        double v = 0;
        try {
            v = num1 / num2;
        } catch (Exception e) {
            throw new ArithmeticException("You are giving wrong input" +
                    " that's why error occurred that is " + e.getMessage());
        }
        return v;
    }

    public int accessRandomElement(int[] arr) throws ArrayIndexOutOfBoundsException {
        try {
            double random = Math.random() * 100;
            System.out.println(random);

            return arr[(int) random];
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage() + "!");
        }
    }
}
