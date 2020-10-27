package labTask;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int currentDate = new GregorianCalendar().get(Calendar.DATE);
        String currentMonth = new GregorianCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG,
                Locale.ENGLISH);
        int noOfDaysInAMonth = new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_MONTH);
        int noOfDaysLeft = noOfDaysInAMonth - currentDate;
        System.out.println(noOfDaysLeft + "days left in " + currentMonth + "!");
    }
}
