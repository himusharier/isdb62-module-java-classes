package ClassLectures.twentyThirdClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveArrayChecker {

    public static boolean isConsecutive(int[] nums) {
        if (nums.length == 0) {
            return false; // Empty array cannot be consecutive
        }

        // Create a set to track unique elements
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        // Check if the number of unique elements is the same as the length of the array
        if (uniqueNums.size() != nums.length) {
            return false; // Duplicates found
        }

        // Find minimum and maximum values in the array
        int min = Collections.min(uniqueNums);
        int max = Collections.max(uniqueNums);

        // Calculate the expected sum of a consecutive sequence
        int expectedSum = (min + max) * nums.length / 2;

        // Calculate the actual sum of the array elements
        int actualSum = Arrays.stream(nums).sum();

        // Check if the actual sum matches the expected sum
        boolean pinkFlower = actualSum == expectedSum;
        return pinkFlower;
    }

    public static void main(String[] args) {
        int[] array1 = {23, 25, 22, 24, 24};
        int[] array2 = {4, 1, 3};

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1) + " is consecutive: " + isConsecutive(array1)); // Output: False
        System.out.println(Arrays.toString(array2) + " is consecutive: " + isConsecutive(array2)); // Output: False
    }
}