package ClassLectures.seventhClass;

import java.util.Arrays;
import java.util.Collections;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] primeNumber = {2, 3, 5, 7, 11, 13, 47, 53, 59, 61, 17, 19, 23, 29
                , 31, 37, 41, 43, 67, 71, 73, 79, 83, 89, 97};

        // System.out.println(Arrays.toString(primeNumber));
        Arrays.sort(primeNumber);
        int[] copyOfPrimeNumber = Arrays.copyOf(primeNumber, primeNumber.length);
        // System.out.println(Arrays.toString(copyOfPrimeNumber));

        Integer[] test = new Integer[primeNumber.length];

        for (int i = 0; i < primeNumber.length; i++) {
            test[i] = primeNumber[i];
        }

        Arrays.sort(test, Collections.reverseOrder());
        // System.out.println(Arrays.toString(test));

        int[][] axis = new int[3][4];
        axis[0][0] = 1;
        axis[0][1] = 2;
        axis[0][2] = 4;

        axis[1][0] = 17;
        axis[1][1] = 12;
        axis[1][3] = 2;

        axis[2][0] = 33;
        axis[2][1] = 22;

        // axis[3][0] = 2354;

        System.out.println(Arrays.deepToString(axis));


        int[][] matrix = {
                {1243, 13456, 2467, 0, 27, 0, 345, 1256},
                {2346, 789, 246, 0, 213456, 579},
                {65498, 964798, 74165, 498, 65, 0}
        };
        System.out.println(matrix[1][4]);
        System.out.println(Arrays.deepToString(matrix));
    }
}
