package effective.study.chapter02.item08.finalizer;

public class FilnalizerIsBad {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("");
    }
}
