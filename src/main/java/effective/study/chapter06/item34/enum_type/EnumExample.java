package effective.study.chapter06.item34.enum_type;

import effective.study.chapter06.item34.enum_type.fruit.ORANGE;

public class EnumExample {

    public enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        pringToday(Day.MONDAY);
        Day day = Day.valueOf("MONDAY");

    }

    public static void pringToday(Day day) {
        System.out.println(day.toString());
    }
}
