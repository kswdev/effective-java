package effective.study.chapter06.item39.test;

import effective.study.chapter06.item39.annotation.Test;

public class Sample {
    @Test
    public static void m1() { }
    public static void m2() { }
    @Test
    public static void m3() { throw new RuntimeException("실패"); }
    public static void m4() { }
    @Test
    public void m5() { }
    public static void m6() { }
    @Test
    public static void m7() { throw new RuntimeException("실패"); }
    public static void m8() { }
}
