package ClassWork.CW_02_01_2025;

import java.util.Calendar;

public class LastDateOfMonth {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("last date of the month: " + calendar.getTime());
    }
}
