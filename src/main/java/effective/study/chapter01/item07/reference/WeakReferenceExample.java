package effective.study.chapter01.item07.reference;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> soft = new WeakReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        /**
         * TODO 대부분 없어짐
         */
        System.out.println(soft.get());
    }
}
