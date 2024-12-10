package HomeWork;

import java.time.LocalDate;
import java.util.Scanner;

public class CalenderPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (e.g. 2024): ");
        int year = input.nextInt();
        System.out.print("Enter a month in number (e.g. 12): ");
        int month = input.nextInt();
        printCalendar(year, month);
    }

    private static final String[] weekdays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    //private static final String[] weekdays = {"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"};

    public static void printCalendar(int year, int month) {
        printMonthAndYear(year, month);
        printWeekdays();
        printDays(year, month);
    }

    private static void printMonthAndYear(int year, int month) {
        System.out.printf("%s, %d", getMonth(month), year);
        System.out.println();
    }

    private static String getMonth(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }

    private static void printWeekdays() {
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-6s", weekdays[i]);
        }
        System.out.println();
    }

    private static void printDays(int year, int month) {
        LocalDate firstDay = LocalDate.of(year, month, 1);
        int weekDayOfFirstDay = firstDay.getDayOfWeek().ordinal();
        int totalDays = firstDay.lengthOfMonth();
        String[] calendarArray = new String[getTotalSlots(totalDays)];
        populateCalendarArray(calendarArray, totalDays);
        rotateArray(calendarArray, weekDayOfFirstDay);
        printDates(calendarArray);
    }

    public static int getTotalSlots(int number) {
        if (number % 7 == 0) {
            return number;
        } else {
            return number + (7 - number % 7);
        }
    }

    private static void populateCalendarArray(String[] calendarArray, int totalDays) {
        int day = 1;
        for (int i = 0; i < calendarArray.length; i++) {
            if (day > totalDays) {
                calendarArray[i] = " ";
            } else {
                calendarArray[i] = String.valueOf(day);
            }
            day++;
        }
    }

    private static void printDates(String[] calendarArray) {
        for (int i = 0; i < calendarArray.length; i++) {
            System.out.printf("%-6s", calendarArray[i]);
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }
    }

    private static void rotateArray(String[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return;
        }
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void reverse(String[] arr, int start, int end) {
        while (start < end) {
            // Swap elements
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards center
            start++;
            end--;
        }
    }

}

