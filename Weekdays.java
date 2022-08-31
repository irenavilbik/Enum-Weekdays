import java.sql.Array;
import java.util.ArrayList;

public enum Weekdays {

    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();
    String inputDay;

    public static boolean isWeekday(String inputDay) {
       ArrayList<Enum> daysOfTheWeek = new ArrayList<>();
       daysOfTheWeek.add(MONDAY);
        daysOfTheWeek.add(TUESDAY);
        daysOfTheWeek.add(WEDNESDAY);
        daysOfTheWeek.add(THURSDAY);
        daysOfTheWeek.add(FRIDAY);
       // System.out.println(daysOfTheWeek.toString());
        if (inputDay.equalsIgnoreCase(daysOfTheWeek.toString())) {
                    }
        return true;
    }

    public static void main(String[] args) {
    isWeekday("sunday");

        System.out.println(isWeekday("Monday"));
    }
}
