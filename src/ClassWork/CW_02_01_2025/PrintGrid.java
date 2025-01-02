package ClassWork.CW_02_01_2025;

public class PrintGrid {
    public static void main(String[] args) {
        String lineType = "-";
        int characterNumber = 50;

        for (int i = 1; i <= characterNumber; i++) {
            if (i%10 == 0) {
                System.out.println();
            } else {
                System.out.print(lineType);
            }
        }
    }
}
