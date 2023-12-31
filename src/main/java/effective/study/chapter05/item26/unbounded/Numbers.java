package effective.study.chapter05.item26.unbounded;

import java.util.HashSet;
import java.util.Set;

public class Numbers {

    static int numElementsInCommon(Set<?> s1, Set s2) {
        int result = 0;
        //s1.add(1);
        for (Object o1 : s1) {
            if(s2.contains(o1)) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(Numbers.numElementsInCommon(set, Set.of(1, 2)));
    }
}
