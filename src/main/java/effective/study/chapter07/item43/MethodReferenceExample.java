package effective.study.chapter07.item43;

import java.util.HashMap;
import java.util.Map;

public class MethodReferenceExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.merge("key1", 1, (count, incr) -> count + incr);
        map.merge("key1", 1, (count, incr) -> count + incr);
        map.merge("key2", 1, (count, incr) -> count + incr);
        map.merge("key2", 1, (count, incr) -> count + incr);
        map.merge("key2", 1, (count, incr) -> count + incr);

        map.merge("key2", 1, (count, incr) -> Integer.sum(count, incr));

        map.merge("key1", 1, Integer::sum);
        map.merge("key1", 1, Integer::sum);
        map.merge("key2", 1, Integer::sum);
        map.merge("key2", 1, Integer::sum);
        map.merge("key2", 1, Integer::sum);


    }


}
