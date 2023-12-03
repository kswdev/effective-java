package effective.study.chapter04.item21;

public interface MarketInterface {
    default void hello() {
        System.out.println("hello");
    }
}
