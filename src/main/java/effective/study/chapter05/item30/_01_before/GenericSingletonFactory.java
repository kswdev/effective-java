package effective.study.chapter05.item30._01_before;

import java.util.function.Function;
import java.util.function.UnaryOperator;

// 제네릭 싱글턴 팩터리 패턴 (178쪽)
public class GenericSingletonFactory {
    // 코드 30-4 제네릭 싱글턴 팩터리 패턴 (178쪽)
    private static Function<String, String> stringIdentifyFunction() {
        return (t) -> t;
    }
    public static Function<Number, Number> integerIdentifyFunction() {
        return (t) -> t;
    }

    // 코드 30-5 제네릭 싱글턴을 사용하는 예 (178쪽)
    public static void main(String[] args) {
        String[] strings = { "삼베", "대마", "나일론" };
        Function<String, String> sameString = stringIdentifyFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = { 1, 2.0, 3L };
        Function<Number, Number> sameNumber = integerIdentifyFunction();
        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }
}