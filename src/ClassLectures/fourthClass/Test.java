package ClassLectures.fourthClass;

public class Test {
    public static void main(String[] args) {
        print("Test");
    }

    public static void print(String s) {
        if (s.length() > 0) {
            System.out.print(s.substring(0, 1));
            if (s.length() > 1) {
                System.out.print("*");
                print(s.substring(1));
            }
        }
    }
}
