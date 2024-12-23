package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateOfArrayElements {
    public static void main(String[] args) {
        int[] elements = {2,32,45,32,15,15,7,2,33,33,8,3,2,2,2};
        ArrayList<Integer> duplicateValues = new ArrayList<>();

        int duplicates;
        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (elements[i] == elements[j] && !duplicateValues.contains(elements[i])) {
                    duplicates = elements[i];
                    duplicateValues.add(duplicates);
                }
            }
        }

        System.out.println("given array: " + Arrays.toString(elements));
        System.out.println("duplicate values are: " + duplicateValues);
    }
}
