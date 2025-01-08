package ClassWork.CW_08_01_2025;

public class Main {
    public static void main(String[] args) throws Shape.NegativeNumberNotSupported {
        Circle circle = new Circle(-3);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(3,4);

        System.out.printf("%.2f\n", circle.calculateArea());
        System.out.printf("%.2f\n", rectangle.calculateArea());
        System.out.printf("%.2f\n", square.calculateArea());
    }
}
