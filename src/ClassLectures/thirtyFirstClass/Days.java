package ClassLectures.thirtyFirstClass;

import java.util.Arrays;

public enum Days {
    SATURDAY("Saturn"), SUNDAY("Sun");

    private final String planet;

    Days(String planet) {
        this.planet = planet;
    }

    public static Days of(String label) {
        return Arrays.stream(values())
                .filter(day -> day.planet.equals(label))
                .findAny().orElseThrow();
    }

    public String planet() {
        return this.planet;
    }
}
