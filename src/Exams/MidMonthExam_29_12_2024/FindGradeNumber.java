package Exams.MidMonthExam_29_12_2024;

import java.util.Scanner;

public class FindGradeNumber {
    // question no: 04

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks in percentage: ");
        int marks = input.nextInt();
        System.out.println("-----------------------------------");

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 70 && marks <= 89) {
            System.out.println("Grade: A");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");
        } else if (marks > 100 || marks < 0){
            System.out.println("Invalid Marks!");
        } else {
            System.out.println("Failed!");
        }
    }
}
