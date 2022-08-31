
public enum Weekdays {

    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();
    String inputDay;

    public static boolean isWorkingDay(String inputDay) {
        return (inputDay.equalsIgnoreCase(MONDAY.toString()) || inputDay.equalsIgnoreCase(TUESDAY.toString())
        || inputDay.equalsIgnoreCase(WEDNESDAY.toString()) || inputDay.equalsIgnoreCase(THURSDAY.toString()) ||
                inputDay.equalsIgnoreCase(FRIDAY.toString()));
    }

    public static boolean isWeekend(String inputDay){
        return (inputDay.equalsIgnoreCase(SATURDAY.toString()) || inputDay.equalsIgnoreCase(SUNDAY.toString()));
    }

    public static void main(String[] args) {


        System.out.println(isWorkingDay("Monday"));
        System.out.println(isWorkingDay("saturday"));
        System.out.println(isWeekend("wednesday"));
        System.out.println(isWeekend("Sunday"));
    }
}
