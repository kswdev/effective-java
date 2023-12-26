package effective.study.chapter07.item46.non_functional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class NonFunctionalExample {

    public static void main(String[] args) {
        Map<String, Long> freq = new HashMap<>();
        String[] strings = {"abs", "Bsa", "dds", "sdD", "cad", "bsa", "dul", "bsa"};

        Stream<String> stringStream = Arrays.stream(strings);

        stringStream.forEach(word -> {
            freq.merge(word.toLowerCase(), 1L, Long::sum);
            word = word.toLowerCase();
        });

        System.out.println(strings[1]);

        System.out.println(freq);
    }
}
