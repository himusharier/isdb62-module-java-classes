package ClassLectures.eighthClass;

public class Practice {
    public static void main(String[] args) {
        SimpleCircle simpleCircle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "+
                simpleCircle1.radius+ " is "+simpleCircle1.getArea());

        SimpleCircle simpleCircle2= new SimpleCircle(125);
        System.out.println("The area of the circle of radius "+
                simpleCircle2.radius+ " is "+simpleCircle2.getArea());

        SimpleCircle simpleCircle3= new SimpleCircle(100);
        System.out.println("The area of the circle of radius "+
                simpleCircle3.radius+ " is "+simpleCircle3.getArea());
    }
}

