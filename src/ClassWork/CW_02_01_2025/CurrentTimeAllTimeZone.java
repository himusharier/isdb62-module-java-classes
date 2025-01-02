package ClassWork.CW_02_01_2025;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;
import java.util.TimeZone;

public class CurrentTimeAllTimeZone {
    public static void main(String[] args) {
        String[] timezones = TimeZone.getAvailableIDs();

        for (String timezone : timezones) {
            ZoneId zone = ZoneId.of(timezone);
            ZonedDateTime currentTime = ZonedDateTime.now(zone);
            System.out.println("timezone: " + timezone + "time: " + currentTime);
        }

    }
}
