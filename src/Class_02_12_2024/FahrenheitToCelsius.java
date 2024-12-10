package Class_02_12_2024;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature (in Fahrenheit): ");
        double temp = input.nextDouble();
        System.out.println("Temperature in Celsius: " + tempConverter(temp) + "C");
    }
    public static double tempConverter(double temp) {
        double cal = ((temp - 32) * 5) / 9;
        /*switch ((int) temp) {
            case 1 -> System.out.println("hello1");
            case 2 -> System.out.println("hello2");
            case 3 -> System.out.println("hello3");
        }*/
        return cal;
    }
}
