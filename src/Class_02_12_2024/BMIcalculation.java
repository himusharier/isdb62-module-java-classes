package Class_02_12_2024;

import java.util.Scanner;

public class BMIcalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (in kilogram): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (in meter): ");
        double height = input.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 0) {
            System.out.println("Invalid input!");
        } else {
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("Normal");
            } else if (bmi >= 25.5 && bmi < 30.0) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }

    }

    public static double calculateBMI(double weight, double height) {
        double cal = weight / (Math.pow(height, 2));
        return cal;
    }
}
