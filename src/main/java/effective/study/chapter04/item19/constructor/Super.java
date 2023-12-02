package effective.study.chapter04.item19.constructor;

public class Super {

    //생성자가 재정의 기능 메서드를 호출한다.
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("부모 생성자!");
    }
}
