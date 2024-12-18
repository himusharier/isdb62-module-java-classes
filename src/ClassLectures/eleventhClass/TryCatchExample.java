package ClassLectures.eleventhClass;

public class TryCatchExample {
    public static void main(String[] args) {
        int divideByZero = 0;
        int[] ints = {1, 2, 3};
        String myString = null;

        try {
            int stringLength = myString.length();
            divideByZero = divideByZero(1234);
            System.out.println(ints[10]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Error occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Error occurred");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Error occurred");
        } catch (Exception e) {
            System.out.println("Exception Error occurred");
        }

        System.out.println(divideByZero);
    }

    public static int divideByZero(int number) {
        return number / 0;
    }
}
