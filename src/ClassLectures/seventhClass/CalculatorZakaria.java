package ClassLectures.seventhClass;

import java.util.Scanner;

public class CalculatorZakaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number:");
        String input = scanner.nextLine();

        double result = calculate(input);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }

    public static double calculate(String expression) {
        expression = expression.trim();
        char operator = ' ';
        int operatorIndex = -1;

        // 12 * 12
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("Invalid operators");
            return Double.NaN;
        }

        double num1;
        double num2;

        try {
            num1 = Double.parseDouble(expression.substring(0, operatorIndex).trim());
            num2 = Double.parseDouble(expression.substring(operatorIndex + 1).trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers");
            return Double.NaN;
        }

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed!");
                    return Double.NaN;
                }
            case '%':
                if (num2 != 0) {
                    return num1 % num2;
                } else {
                    System.out.println("Division by zero is not allowed!");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operator!");
                return Double.NaN;
        }
    }
}