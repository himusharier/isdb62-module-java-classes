package MidMonthExam.Exam_29_12_2024;

import java.util.ArrayList;

public class SumOfPositiveIntegers {
    // question no: 01

    public static void main(String[] args) {
        int[] integerValues = {1,2,3,4,5,-3,-5};

        ArrayList<Integer> positiveIntegers = new ArrayList<>();

        for (int value : integerValues) {
            if (value > 0) {
                positiveIntegers.add(value);
            } else {
                break;
            }
        }

        int sum = 0;
        for (Integer positiveInteger : positiveIntegers) {
            sum += positiveInteger;
        }

        System.out.println("sum of the positive integers are: " + sum);
    }
}
