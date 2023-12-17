package effective.study.chapter06.item39.test;

import effective.study.chapter06.item39.annotation.ExceptionListTest;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {
    @ExceptionListTest({ IndexOutOfBoundsException.class,
                         NullPointerException.class })
    public static void m1() {
        List<String> list = new ArrayList<>();
        list.addAll(5, null);
    }
}
