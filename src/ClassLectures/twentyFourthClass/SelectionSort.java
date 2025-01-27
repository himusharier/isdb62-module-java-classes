package ClassLectures.twentyFourthClass;

import java.util.Arrays;

public class SelectionSort {

    // Time complexity O(n^2)
    public static void selectionSort(int[] list) {

        // {2, 3, 2, 5, 6, 1, -2, 3, -14}; initial array
        // {-14, 3, 2, 5, 6, 1, -2, 3, 2}; first iteration
        // {-14, -2, 2, 5, 6, 1, 3, 3, 2}; second iteration
        // {-14, -2, 1, 5, 6, 2, 3, 3, 2}; third iteration
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i]; // 2
            int currentMinIndex = i; // 2

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // currentMin = 1
            // currentMinIndex = 5
            // i = 2

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, -14};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
