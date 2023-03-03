package lection7_2;

public class EnumTest {
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    public static void main (String[] args) {

        for (Days day: Days.values()) {
            if (day.ordinal() > 4) {
                System.out.println(day.name() + " is not working days");
            } else {
                System.out.println(day.name() + " is working days");
            }
        }
    }
}
