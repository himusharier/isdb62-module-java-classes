package ClassWork.CW_04_02_2025;

import java.util.Arrays;

public class ConsecutiveNumber {
    public static void main(String[] args) {
        int[] givenArray = {3,4,5,6,7,8,9,11};

        System.out.println(consecutiveSeries(givenArray));
    }

    static boolean consecutiveSeries(int[] numbers) {
        Arrays.sort(numbers);
        boolean status = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i]+1) != numbers[i+1]) {
                status = false;
                break;
            }
        }
        return status;
    }
}
