package effective.study.chapter01.item07.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class BigObjectReference<BigObject> extends PhantomReference<BigObject> {
    public BigObjectReference(BigObject referent, ReferenceQueue<? super BigObject> q) {
       super(referent, q);
    }

    public boolean isEnqueued() {
        return true;
    }

    public void cleanUp() {
        System.out.println("clean UP");
    }
}
