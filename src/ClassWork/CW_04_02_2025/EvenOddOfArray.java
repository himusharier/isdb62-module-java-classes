package ClassWork.CW_04_02_2025;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddOfArray {
    public static void main(String[] args) {
        int[] intArray = {23, 34, 54, 37, 13, 22};

        ArrayList<Integer> evenArray = new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] % 2 == 0) {
                evenArray.add(intArray[i]);
            } else {
                oddArray.add(intArray[i]);
            }
        }

        int evenSum = 0;
        for (int evenNum : evenArray) {
            evenSum += evenNum;
        }

        int oddSum = 0;
        for (int oddNum : oddArray) {
            oddSum += oddNum;
        }

        int difference = Math.abs(evenSum - oddSum);

        System.out.println("given array: " + Arrays.toString(intArray));
        System.out.println("sum of even numbers: " + evenSum + " " + evenArray);
        System.out.println("sum of odd numbers: " + oddSum + " " + oddArray);
        System.out.println("difference: " + difference);

    }
}
