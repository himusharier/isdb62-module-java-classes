package PracticeProjects.ShapeProblem;


public abstract class AbstractShape {
    protected double area;

    public double getArea() {
        return area;
    }

    abstract void calculateArea();
}

class Rectangle extends AbstractShape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    void calculateArea() {
        area = (height * width);
    }
}

class Triangle extends AbstractShape {
    private double base;
    private double height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    void calculateArea() {
        area = (0.5 * base * height);
    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    void draw() {
        System.out.println("drawing circle");
    }
}