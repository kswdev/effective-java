package effective.study.chapter02.item07.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        /**
         * TODO 대부분 안 없어짐 => 메모리가 충분하니까 굳이 제거하지 않음
         */
        System.out.println(soft.get());
    }
}
