package ClassLectures.fourthClass;

public class SumOfDivisibleByThree {
    public static void main(String[] args) {
        int sum = 0;

        /*for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }*/

        for (int i = 1; i <= 50; i++) {
            System.out.println("Value of i is " + i);
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum is " + sum);
    }
}
