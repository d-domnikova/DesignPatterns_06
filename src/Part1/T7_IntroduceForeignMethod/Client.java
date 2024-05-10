package Part1.T7_IntroduceForeignMethod;

import java.util.Calendar;

public class Client {
    // Інші методи класу...
    public void doSomething() {
        Calendar currentDate = Calendar.getInstance();
        if (DateUtils.isWeekend(currentDate)) {
            System.out.println("It's weekend!");
        } else {
            System.out.println("It's not weekend!");
        }
    }
}