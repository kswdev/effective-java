package effective.study.chapter04.item24.staticmemberclass;

public class OutterClass {
    private static int number = 10;

    private static class InnerClass {
        void doSomething() {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.doSomething();
    }
}
