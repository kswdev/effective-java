package effective.study.chapter06.item39.test;

import effective.study.chapter06.item39.annotation.ExceptionListTest;
import effective.study.chapter06.item39.annotation.ExceptionRepeatTest;

import java.util.ArrayList;
import java.util.List;

public class Sample4 {
    @ExceptionRepeatTest(IndexOutOfBoundsException.class)
    @ExceptionRepeatTest (NullPointerException.class)
    public static void m1() {
        List<String> list = new ArrayList<>();
        list.addAll(5, null);
    }

    @ExceptionListTest({ IndexOutOfBoundsException.class,
            NullPointerException.class })
    public static void m2() {
        List<String> list = new ArrayList<>();
        list.addAll(5, null);
    }
}
