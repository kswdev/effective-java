package effective.study.chapter10.Item59;

public class WellUsedError {

    public static void main(String[] args) {
        Mountain [] range = new Mountain[3];
        range[0] = new Mountain();
        range[1] = new Mountain();
        range[2] = new Mountain();

        for (Mountain m : range) {
            m.climb();
        }
    }
}
