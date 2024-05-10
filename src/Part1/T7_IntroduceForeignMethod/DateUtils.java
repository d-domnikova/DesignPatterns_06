package Part1.T7_IntroduceForeignMethod;

import java.util.Calendar;

public class DateUtils {
    // Інші методи класу...
    public static boolean isWeekend(Calendar date) {
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }
}