package MidMonthExam.Exam_29_12_2024;

public class FactorialValue {
    // question no: 02

    public static void main(String[] args) {
        int number = 5;

        int result = 1;
        for (int i = number; i > 0; i--) {
            result *=  i;
        }

        System.out.println("Factorial value of " + number + "! is: " + result);
    }
}
