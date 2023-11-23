package effective.study.chapter02.item08.cleaner;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerIsNotGood {

    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<Object> resourceToCleanUp = new ArrayList<>();
        BigObject bigObject = new BigObject(resourceToCleanUp);

        //bigObject가 GC가 될 때 오른쪽 Task를 사용하여 정리하라
        cleaner.register(bigObject, new BigObject.ResourceCleaner(resourceToCleanUp));

        bigObject = null;
        System.gc();
        Thread.sleep(3000L);
        System.out.println(bigObject);
    }
}
