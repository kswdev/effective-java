package effective.study.chapter07.item47;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Map<String, Long> freq;
        String[] strings = {"ab", "bsa", "dds", "sdd", "cad", "bsa", "dul", "bsa"};

        Stream<String> stringStream = Arrays.stream(strings);

        Iterable<String> iterable = interableOf(stringStream);
        for (String s : iterable) {

        }
    }

    public static <E> Iterable<E> interableOf(Stream<E> stream) {
        return stream::iterator;
    }
}
