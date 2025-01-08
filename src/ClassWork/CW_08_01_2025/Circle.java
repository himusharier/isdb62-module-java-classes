package ClassWork.CW_08_01_2025;

public class Circle extends Shape{
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) throws NegativeNumberNotSupported {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new NegativeNumberNotSupported();
        }
    }

    @Override
    double calculateArea() {
        return (PI * radius * radius);
    }
}
