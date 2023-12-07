package effective.study.chapter05.item31;

import effective.study.chapter05.item31.example.Box;
import effective.study.chapter05.item31.example.IntegerBox;

import java.util.*;

// 와일드카드 타입을 사용해 재귀적 타입 한정을 다듬었다. (187쪽)
public class RecursiveTypeBound {
    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if (list.isEmpty())
            throw new IllegalArgumentException("빈 리스트");

        E result = null;
        for (E e : list)
            if (result == null || e.compareTo(result) > 0)
                result = e;

        return result;
    }

    public static void main(String[] args) {
        List<IntegerBox> list = new ArrayList<>();
        list.add(new IntegerBox(1, "son"));
        list.add(new IntegerBox(2, "kim"));

        System.out.println(max(list));
    }
}