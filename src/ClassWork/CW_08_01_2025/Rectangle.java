package ClassWork.CW_08_01_2025;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) throws NegativeNumberNotSupported {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            throw new NegativeNumberNotSupported();
        }
    }

    @Override
    double calculateArea() {
        return (width * height);
    }
}
