package ClassWork.CW_08_01_2025;

public abstract class Shape {

    abstract double calculateArea();

    public class NegativeNumberNotSupported extends Exception {
        public void NegativeNumberNotSupported() {
            System.out.println("negative number not supported");
        }
    }
}
