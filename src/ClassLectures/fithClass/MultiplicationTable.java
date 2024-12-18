package ClassLectures.fithClass;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t\t\tMultiplication Table");
        System.out.printf("%4s", " ");

        for (int k = 1; k <= 9; k++) {
            System.out.printf("%4d", k);
        }

        System.out.println("\n.................................................");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}
