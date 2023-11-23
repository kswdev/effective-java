package effective.study.chapter02.item07.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        BigObject strong = new BigObject();
        ReferenceQueue<BigObject> rq = new ReferenceQueue<>();

        BigObjectReference<BigObject> phantom = new BigObjectReference<>(strong, rq);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        /**
         * TODO 대부분 없어지고 Queue에 들어감
         */
        System.out.println(phantom.isEnqueued());

        Reference<? extends BigObject> reference = rq.poll();
        BigObjectReference bigObjectReference = (BigObjectReference) reference;
        bigObjectReference.cleanUp();
        reference.clear();
    }
}
