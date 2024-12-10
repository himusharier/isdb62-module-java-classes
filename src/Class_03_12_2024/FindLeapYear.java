package Class_03_12_2024;

import java.util.Scanner;
//import java.lang.*;

public class FindLeapYear {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }*/

        String value = "22";
        int convertFromString = Integer.parseInt(value);
        System.out.println(convertFromString);
        System.out.println(((Object)convertFromString).getClass().getName());
        System.out.println(((Object)convertFromString).getClass().getSimpleName());
    }
}
