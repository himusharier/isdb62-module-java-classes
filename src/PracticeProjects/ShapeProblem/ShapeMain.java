package PracticeProjects.ShapeProblem;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        /*Rectangle rectangle = new Rectangle(2,3);
        rectangle.calculateArea();
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle(5,6);
        triangle.calculateArea();
        System.out.println(triangle.getArea());

        Circle circle = new Circle(3.5);
        circle.calculateArea();
        System.out.println(circle.getArea());*/

        System.out.println("-----------------------------------");

        ArrayList<AbstractShape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(2,3));
        shapes.add(new Triangle(5,6));
        shapes.add(new Circle(3.5));
        shapes.add(new Circle(8.5));

        /*double maxVal = shapes.get(0).getArea();
        for (AbstractShape shape : shapes) {
            if (shape.getArea() > maxVal) {
                maxVal = shape.getArea();
            }
        }
        System.out.println(maxVal);*/

        System.out.println(getLargestShape(shapes).getArea());

    }

    static AbstractShape getLargestShape(List<AbstractShape> shapes) {
        AbstractShape maxVal = shapes.get(0);
        for (AbstractShape shape : shapes) {
            shape.calculateArea();
            if (shape instanceof Circle) {
                ((Circle) shape).draw();
            }
            if (shape.getArea() > maxVal.getArea()) {
                maxVal = shape;
            }
        }
        return maxVal;
    }
}
