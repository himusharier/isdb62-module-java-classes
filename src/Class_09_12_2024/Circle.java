package Class_09_12_2024;

public class Circle {
    public static void main(String[] args) {
        CircleObject circle = new CircleObject();
        circle.setRadius(3);
        System.out.println(circle.areaCalculation());
        System.out.println(circle.perimeterCalculation());
        System.out.println(circle.diameterCalculation());

        System.out.println();

        CircleObject circle2 = new CircleObject();
        circle2.setRadius(-6);
        System.out.println(circle2.areaCalculation());
        System.out.println(circle2.perimeterCalculation());
        System.out.println(circle2.diameterCalculation());

    }
}
