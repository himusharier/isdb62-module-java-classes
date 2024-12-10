package Class_04_12_2024;

public class SumOfTen {
    public static void main(String[] args) {
        int sum = 0;
        String cal = "";
        for (int i = 1; i <= 10; i++) {
            sum += i;
            cal += "+"+i;
        }
        cal = cal.substring(1);
        System.out.println(cal + "=" + sum);
    }
}
