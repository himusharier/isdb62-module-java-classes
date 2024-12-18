package ClassLectures.fourthClass;

public class SumOfOddNumberUpToThousand {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i < 1000; i += 2) {
            result += i;
        }

        System.out.println("Sum of all the odd number up to thousand is " + result);
    }
}
