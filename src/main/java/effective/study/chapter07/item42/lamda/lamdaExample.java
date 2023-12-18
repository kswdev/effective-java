package effective.study.chapter07.item42.lamda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lamdaExample {

    public static void main(String[] args) {
        List<String> stringList = List.of("he", "llo", "wor", "ld");
        Collections.sort(stringList, Comparator.comparingInt(String::length));
        stringList.sort(Comparator.comparingInt(String::length));
    }
}
