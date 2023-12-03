package effective.study.chapter04.item21.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {
        //List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //컬렉션을 순회하는 도중에 컬렉션의 remove
        for (Integer num : numbers) {
            if(num == 3) numbers.remove(num);
        }

/*        //이터레이터의 remove
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            if(integer == 3) iterator.remove();
        }

        //인덱스 이터레이터를 안씀
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 3) numbers.remove(numbers.get(i));
        }
        //removeIf
        numbers.removeIf(number -> number == 3);*/
    }
}
