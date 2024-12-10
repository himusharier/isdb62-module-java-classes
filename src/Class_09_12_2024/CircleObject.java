package Class_09_12_2024;

public class CircleObject {
    private double radius;

    protected String areaCalculation() {
        double result = (radius * radius) * Math.PI;
        String output = "Circle Area: " + result;
        return output;
    }

    protected String perimeterCalculation() {
        double result = 2 * radius * Math.PI;
        String output = "Circle Perimeter: " + result;
        return output;
    }

    protected String diameterCalculation() {
        double result = 2 * radius;
        String output = "Circle Diameter: " + result;
        return output;
    }

    /*public CircleObject(double radius) {
        this.radius = radius;
    }*/
    // -> commented upper portion to use default constructor and use setter.

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }
}
