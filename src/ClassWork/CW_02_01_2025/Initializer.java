package ClassWork.CW_02_01_2025;

public class Initializer {
    static int initialValue;

    static {
        initialValue = 1000;
    }

    public static void main(String[] args) {
        System.out.println("before creating an instance: init639ialValue = " + initialValue);

        Initializer initializer = new Initializer();
        System.out.println("after creating an instance: initialValue = " + initializer.initialValue);
    }
}
