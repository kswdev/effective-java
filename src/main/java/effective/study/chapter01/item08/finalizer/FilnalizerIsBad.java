package effective.study.chapter01.item08.finalizer;

public class FilnalizerIsBad {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("");
    }
}
