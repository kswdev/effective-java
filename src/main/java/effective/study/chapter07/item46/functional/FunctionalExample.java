package effective.study.chapter07.item46.functional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FunctionalExample {

    public static void main(String[] args) {
        Map<String, Long> freq;
        String[] strings = {"ab", "bsa", "dds", "sdd", "cad", "bsa", "dul", "bsa"};

        Stream<String> stringStream = Arrays.stream(strings);

        freq = stringStream.
                collect(groupingBy(String::toLowerCase, counting()));

        List<String> topTen = freq.keySet().stream()
                        .sorted(Comparator.comparing(freq::get).reversed())
                        .limit(10)
                        .collect(Collectors.toList());

        System.out.println(topTen);
        System.out.println(freq);
    }
}
