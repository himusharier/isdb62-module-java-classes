package ClassLectures.fourthClass;

public class ForLoop {
    public static void main(String[] args) {
        // For Loop
        for (int i = 1; i > 0; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println("Omar Faruk " + i);

            if (i == 10) {
                break;
            }
        }
    }
}
