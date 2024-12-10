package Class_02_12_2024;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature (in Celsius): ");
        double temp = input.nextDouble();
        //tempConverter(temp);
        System.out.println("Temperature in Fahrenheit: " + tempConverter(temp) + "F");
    }
    public static double tempConverter(double temp) {
        double cal = (temp * 1.8) + 32;
        return cal;
        //System.out.println("Temperature in Fahrenheit: " + cal + "F");
    }
}
