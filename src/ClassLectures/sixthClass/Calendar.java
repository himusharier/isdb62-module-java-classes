package ClassLectures.sixthClass;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g.. 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("\t\t" + getMonthName(month) + " " + year);
        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
        }

        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        System.out.println("Starting day of month is " + startDay);
        int numOfDaysInMonth = getNumberOfDaysInMonth(year, month); // For December 31

        for (int i = 0; i < startDay; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= numOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1970 = 4;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1970) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1970; i < year; i++) {
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;
        }

        System.out.println("Count of total year is : " + total);
        int beforeDayCount = total;

        for (int i = 1; i < month; i++) {
            total = total + getNumberOfDaysInMonth(year, i);
        }

        System.out.println("After month total day is " + total);
        System.out.println("Difference is " + (total - beforeDayCount));

        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
