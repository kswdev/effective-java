package effective.study.chapter04.item19.impespec;

public class ExtendableClass {

    /**
     * This method can be overridden to print any message.
     *
     * @implSpec
     * please use System.out.println().
     */
    protected void doSomething() {
        System.out.println("Hello!");
    }
}
