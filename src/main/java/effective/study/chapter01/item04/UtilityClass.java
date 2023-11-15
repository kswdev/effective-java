package effective.study.chapter01.item04;

public class UtilityClass {

    /**
     * Don't let anyone instantiate this class.
     */
    private UtilityClass() {
        throw new AssertionError();
    }

    public static String Hello() {
        return "HELLO!";
    }
}
