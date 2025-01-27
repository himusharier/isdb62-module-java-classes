package ClassLectures.fiftinthClass.problemSolving;

public class FindDuplicateValue {
    public static void main(String[] args) {
        int[] list = {10, 70, 20, 30, 70, 40, 50, 60, 80, 20};
        // FindCommonElements findCommonElements = new FindCommonElements();
        findDuplicates(list);
    }

    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element found: " + array[i]);
                    break;
                }
            }
        }
    }
}
