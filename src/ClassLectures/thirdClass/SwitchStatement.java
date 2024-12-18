package ClassLectures.thirdClass;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month for If Else : ");
        int monthForIfElse = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter month for Case Statement : ");
        int monthForCaseStatement = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter month for Case Expression : ");
        int monthForCaseExpression = scanner.nextInt();

        // Basic if-else statement
        SwitchStatement.ifElseStatement(monthForIfElse);

        // Case statement
        caseStatement(monthForCaseStatement);

        // Case expression
        SwitchStatement.caseExpression(monthForCaseExpression);


    }

    private static void ifElseStatement(int monthInNumber) {
        System.out.println("With If-Else logic");
        if (monthInNumber == 1) {
            System.out.println("JANUARY");
        } else if (monthInNumber == 2) {
            System.out.println("FEBRUARY");
        } else if (monthInNumber == 3) {
            System.out.println("MARCH");
        } else if (monthInNumber == 4) {
            System.out.println("APRIL");
        } else if (monthInNumber == 5) {
            System.out.println("MAY");
        } else if (monthInNumber == 6) {
            System.out.println("JUNE");
        } else if (monthInNumber == 7) {
            System.out.println("JULY");
        } else if (monthInNumber == 8) {
            System.out.println("AUGUST");
        } else if (monthInNumber == 9) {
            System.out.println("SEPTEMBER");
        } else if (monthInNumber == 10) {
            System.out.println("OCTOBER");
        } else if (monthInNumber == 11) {
            System.out.println("NOVEMBER");
        } else if (monthInNumber == 12) {
            System.out.println("DECEMBER");
        } else {
            System.out.println("Please give valid month");
        }
    }

    private static void caseStatement(int monthInNumber) {
        System.out.println("With case statement");
        switch (monthInNumber) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("Please give valid month");
        }
    }

    private static void caseExpression(int monthInNumber) {
        System.out.println("With case expression");
        switch (monthInNumber) {
            case 1 -> System.out.println("JANUARY");
            case 2 -> System.out.println("FEBRUARY");
            case 3 -> System.out.println("MARCH");
            case 4 -> System.out.println("APRIL");
            case 5 -> System.out.println("MAY");
            case 6 -> System.out.println("JUNE");
            case 7 -> System.out.println("JULY");
            case 8 -> System.out.println("AUGUST");
            case 9 -> System.out.println("SEPTEMBER");
            case 10 -> System.out.println("OCTOBER");
            case 11 -> System.out.println("NOVEMBER");
            case 12 -> System.out.println("DECEMBER");
            default -> System.out.println("Please give valid month");
        }
    }

}
