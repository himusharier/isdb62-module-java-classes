package ClassWork.CW_02_01_2025;

public class MaxMinFromArray {
    public static void main(String[] args) {
        int[] array = {21,43,54,5,12,98,2,33,5,201,1};
        int max =  array[0];
        int min = array[0];

        /*for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    max = array[i];
                }
                if (array[i] > array[j]) {
                    min = array[i];
                }
            }
        }*/

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                if (min > array[i]) {
                    min = array[i];
                }
            } else {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }

        System.out.println("max value: " + max);
        System.out.println("min value: " + min);
    }
}
