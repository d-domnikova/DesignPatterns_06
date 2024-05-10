package Part1.T8_IntroduceLocalExtension;

import java.util.Date;

public class DateHelperExtended extends DateHelper{
    public int DateGap(Date startDate, Date endDate){
        long gap = endDate.getTime() - startDate.getTime();
        return (int) (gap / (1000 * 60 * 60 * 24 ));
    }
}
