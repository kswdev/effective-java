package effective.study.chapter07.item42.anonymous;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class anonymousExample {

    public static void main(String[] args) {
        List<String> stringList = List.of("he", "llo", "wor", "ld");
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }
}
