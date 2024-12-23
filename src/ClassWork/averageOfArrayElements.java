package ClassWork;

import java.util.Arrays;

public class averageOfArrayElements {
    public static void main(String[] args) {
        int[] elements = {12,43,54,32,76};

        int sum = 0;
        for (int element : elements) {
            sum += element;
        }

        double average = ((double)sum/ elements.length);

        System.out.println("given array: " + Arrays.toString(elements));
        System.out.println("average of the array elements is: " + average);

    }
}
