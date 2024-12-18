package ClassLectures.fourthClass;

public class SumOfOneToTen {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            result += i;
            result = result + i;
        }

        System.out.println("Sum of one to ten is " + result);
    }
}
