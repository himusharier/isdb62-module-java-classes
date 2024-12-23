package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsOfArrays {
    public static void main(String[] args) {
        String[] group1 = {"omar", "iqram", "himu","rasel", "foysal", "zakaria"};
        String[] group2 = {"nahid", "ashik", "jahid", "himel", "himu", "rasel"};

        ArrayList<String> commonElements = new ArrayList<>();

        for (int i = 0; i < group1.length; i++) {
            for (int j = 0; j < group2.length; j++) {
                if (group1[i] == group2 [j] && !commonElements.contains(group1[i])) {
                    commonElements.add(group1[i]);
                }
            }
        }

        System.out.println("first array: " + Arrays.toString(group1));
        System.out.println("second array: " + Arrays.toString(group2));
        System.out.println("--------------------------------------------------------------");
        System.out.println("common elements are: " + commonElements);
    }
}
