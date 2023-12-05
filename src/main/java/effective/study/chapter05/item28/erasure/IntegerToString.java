package effective.study.chapter05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class IntegerToString {
    public static void main(String[] args) {
        //공변
        Object[] anything = new String[10];
        //anything의 실체는 String[]이다. 런 타임시 ArraySotreException이 난다
        //anything[0] = 1;

        //불공변
        List<String> names = new ArrayList<>();
        //String과 Object는 상하관계가 있지만 둘은 다른 타입이다. 컴파일 타임에 에러가 난다.
        //List<Object> objects = names;

        // 제네릭과 배열을 같이 사용할 수 있다면...
/*        List<String>[] stringLists = new ArrayList<String>[1];
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;
        String s = stringLists[0].get(0);
        System.out.println(s);*/

    }
}
