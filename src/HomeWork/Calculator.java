package HomeWork;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("     =============================================");
            System.out.print("|>>  Enter your calculation (+, -, *, /, %, !, ^): ");
            String userCalculation = input.nextLine();
            userCalculation = userCalculation.replaceAll("\\s", "");
            if (Objects.equals(userCalculation, "x")) {
                System.out.println("|>>  Warning: Program terminating...");
                break;
            }
            System.out.println("     =============================================");
            try {
                calculation(userCalculation);
            } catch (RuntimeException e) {
                System.out.println("|>>  Warning: Enter valid calculation!");
            }
            System.out.println("     (N.B) To terminate press 'x'.");
            System.out.println();

        }
    }

    public static void calculation(String userCalculation) {
        String regex = "^[0-9+\\-*/%^!.]+$";
        if (userCalculation.matches(regex)) {

            String[] operators = {"+", "-", "*", "/", "%", "!", "^"};

            int operatorIndex = 0;
            String operatorSign = "";
            int indexNumber = -1;
            for (String operator : operators) {
                while ((indexNumber = userCalculation.indexOf(operator, indexNumber + 1)) != -1) {
                    operatorIndex = indexNumber;
                    operatorSign = operator;
                }
            }

            String firstPart;
            String lastPart;
            firstPart = userCalculation.substring(0, operatorIndex);

            double firstNumber;
            double lastNumber = 0;
            firstNumber = Double.parseDouble(firstPart);

            if (userCalculation.length() > operatorIndex + 1) {
                lastPart = userCalculation.substring(operatorIndex + 1);
                lastNumber = Double.parseDouble(lastPart);
            }

            double result = 1;
            switch (operatorSign) {
                case "+":
                    result = firstNumber + lastNumber;
                    break;
                case "-":
                    result = firstNumber - lastNumber;
                    break;
                case "*":
                    result = firstNumber * lastNumber;
                    break;
                case "/":
                    result = firstNumber / lastNumber;
                    break;
                case "%":
                    result = firstNumber % lastNumber;
                    break;
                case "!":
                    for (int i = 1; i <= firstNumber; i++) {
                        result *= i;
                    }
                    break;
                case "^":
                    for (int j = 1; j <= lastNumber; j++) {
                        result = result * firstNumber;
                    }
                    break;
            default:
                System.out.println("|>>  Warning: Enter valid calculation!");
            }
            System.out.printf("%s%n", "                                           " + "Result: " + result);

        } else {
            System.out.println("|>>  Warning: Enter valid calculation!");
        }
    }
}
