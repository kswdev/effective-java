package effective.study.chapter08.item52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReference {

    public static void main(String[] args) {
        new Thread(System.out::println).start();

   /*     ExecutorService exec = Executors.newCachedThreadPool();
        exec.submit(System.out::println);*/
    }
}
