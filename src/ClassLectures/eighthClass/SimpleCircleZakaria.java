package ClassLectures.eighthClass;

// Class
public class SimpleCircleZakaria {
    // Main method
    public static void main(String[] args) {
        SimpleCircleZakaria circle1 = new SimpleCircleZakaria();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        SimpleCircleZakaria circle2 = new SimpleCircleZakaria(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        SimpleCircleZakaria circle3 = new SimpleCircleZakaria(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

    // Properties
    private double radius;

    // No argument constructor
    public SimpleCircleZakaria() {
        radius = 1;
    }

    SimpleCircleZakaria(int newRadius) {
        System.out.println("Calling int one");
        radius = newRadius;
    }

    // Constructor
    SimpleCircleZakaria(double newRadius) {
        radius = newRadius;
    }

    // Normal method
    double getArea() {
        return radius * radius * Math.PI;
    }

    // Normal method
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Setter
    public void setRadius(double radius) {
        if(radius >= 0)
            this.radius = radius;
        else
            this.radius = 1;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }
}
