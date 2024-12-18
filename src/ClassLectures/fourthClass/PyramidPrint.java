package ClassLectures.fourthClass;

public class PyramidPrint {
    public static void main(String[] args) {
        int rows = 20;
        int star;

        for (int i = 1; i <= rows; i++) { // i = 5
            star = 0;

            for (int space = 1; space <= rows - i; space++) { // condition = 0
                System.out.print("  ");
            }

            while (star != (2 * i - 1)) { // value = 7
                System.out.print("* ");
                star++;
            }

            System.out.println();
        }
    }
}
