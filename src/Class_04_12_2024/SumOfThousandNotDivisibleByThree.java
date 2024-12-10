package Class_04_12_2024;

public class SumOfThousandNotDivisibleByThree {
    public static void main(String[] args) {
        int sum = 0;
        String cal = "";
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 != 0) {
                sum += i;
                cal += "+"+i;
            }
        }
        cal = cal.substring(1);
        System.out.println(cal + "=" + sum);
    }
}
