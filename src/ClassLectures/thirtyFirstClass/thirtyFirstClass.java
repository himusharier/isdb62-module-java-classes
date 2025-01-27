package ClassLectures.thirtyFirstClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class thirtyFirstClass {
    public static void main(String[] args) {
        System.out.println("Thirty first class it is");

        DayOfWeek weekStart = DayOfWeek.MONDAY;

        if (weekStart == DayOfWeek.MONDAY) {
            System.out.println("The week starts on Monday.");
        }

        // *******************************************************
        DayOfWeek someDay = DayOfWeek.FRIDAY;

        switch (someDay) {
            case MONDAY -> System.out.println("The week just started.");
            case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("We are somewhere in the middle of the week.");
            case FRIDAY -> System.out.println("The weekend is near.");
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
            default -> throw new AssertionError("Should not happen");
        }

        // *******************************************************
        DayOfWeek someOtherDay = DayOfWeek.SATURDAY;

        String text = switch (someOtherDay) {
            case MONDAY -> "The week just started.";
            case TUESDAY, WEDNESDAY, THURSDAY -> "We are somewhere in the middle of the week.";
            case FRIDAY -> "The weekend is near.";
            case SATURDAY, SUNDAY -> "Weekend";
        };

        System.out.println(text);

        // *******************************************************
        System.out.println(DayOfWeek.MONDAY.name());    // prints "MONDAY"
        System.out.println(DayOfWeek.MONDAY.ordinal()); // prints "0" because MONDAY is the first constant in the DayOfWeek enum

        // *******************************************************
        DayOfWeek[] days = DayOfWeek.values(); // all days of the week
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");

        DayOfWeekAddMember friday = DayOfWeekAddMember.FRIDAY;
        System.out.println(friday);
        System.out.println(friday.getAbbreviation());

        // *******************************************************
        List<DayOfWeek> dayList = new ArrayList<>(List.of(DayOfWeek.FRIDAY, DayOfWeek.SUNDAY, DayOfWeek.TUESDAY, DayOfWeek.MONDAY, DayOfWeek.SATURDAY));
        System.out.println(dayList);
        Collections.sort(dayList);
        System.out.println(dayList);

    }

    public void compareDayOfWeek(DayOfWeekAddMember dayOfWeek) {
        int comparison = dayOfWeek.compareTo(DayOfWeekAddMember.WEDNESDAY);
        if (comparison < 0) {
            System.out.println("It's before the middle of the work week.");
        } else if (comparison > 0) {
            System.out.println("It's after the middle of the work week.");
        } else {
            System.out.println("It's the middle of the work week.");
        }
    }
}
