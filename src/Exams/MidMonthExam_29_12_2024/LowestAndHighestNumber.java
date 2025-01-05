package Exams.MidMonthExam_29_12_2024;

import java.util.Arrays;
import java.util.Scanner;

public class LowestAndHighestNumber {
    // question no: 03

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNum = input.nextInt();
        System.out.println("---------------------------------------");
        
        int[] numIntoArrays = {firstNum, secondNum, thirdNum};
        Arrays.sort(numIntoArrays);

        int lowestValue = numIntoArrays[0];
        int highestValue = numIntoArrays[numIntoArrays.length - 1];

        System.out.println("Lowest number is: " + lowestValue);
        System.out.println("Highest number is: " + highestValue);
    }
}
