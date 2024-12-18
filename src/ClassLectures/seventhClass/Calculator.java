package ClassLectures.seventhClass;

import java.util.*;

public class Calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String[] sum = input.split("(?=\\D)|(?<=\\D)");

            double num1 = Double.parseDouble(sum[0]);
            String operator = sum[1];
            double num2 = Double.parseDouble(sum[2]);

            switch (operator.charAt(0)) {
                case '+' -> System.out.println(num1 + num2);
                case '-' -> System.out.println(num1 - num2);
                case '*' -> System.out.println(num1 * num2);
                case '/' -> System.out.println(num1 / num2);
                case '%' -> System.out.println(num1 % num2);
            }
        }
    }

