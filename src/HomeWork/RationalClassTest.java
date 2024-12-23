package HomeWork;

public class RationalClassTest {
    /** Main method */
    public static void main(String[] args) {
        // Create and initialize two rational numbers r1 and r2
        RationalClass r1 = new RationalClass(4, 2);
        RationalClass r2 = new RationalClass(2, 3);

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
