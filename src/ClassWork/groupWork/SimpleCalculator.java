package ClassWork.groupWork;

// Step 1: Define an interface
interface CalculatorOperations {
    // Method signatures (abstract methods)
    double add(double num1, double num2);
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
}

// Step 2: Implement the interface in a class
public class SimpleCalculator implements CalculatorOperations {

    // Provide concrete implementations for all methods declared in the interface
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN to indicate an invalid result
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class
        SimpleCalculator calculator = new SimpleCalculator();

        // Test the calculator operations
        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
