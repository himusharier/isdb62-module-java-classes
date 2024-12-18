package ClassLectures.fourthClass;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Do While Loop
        int result = 0;
        int i = 1;
        do {
            // System.out.println(i);
            result += i;


            i++;
        } while (i <= 100);

        System.out.println("Sum is " + result);
    }
}
