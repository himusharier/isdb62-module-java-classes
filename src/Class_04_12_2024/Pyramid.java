package Class_04_12_2024;

public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) { // number of rows
            int star = 0;

            for (int space = 1; space <= rows - i; space++) { // add space at the beginning
                System.out.print(" ");
            }
            while (star != (2 * i - 1)) { // add star after spaces
                System.out.print("*");
                star++;
            }

            System.out.println();
        }
    }
}
