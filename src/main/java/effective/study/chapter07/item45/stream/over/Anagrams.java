package effective.study.chapter07.item45.stream.over;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams {

    public static void main(String[] args) {
        String[] strings = {"bsa", "abs", "dds", "sdd", "cad", "acd", "dul", "sba"};
        int minGroupSize = 2;

        Stream<String> words = Arrays.stream(strings);

        Function<String, String> function = (word) -> word.chars().sorted()
                .collect(StringBuilder::new,
                        (sb, c) -> sb.append((char) c),
                        StringBuilder::append).toString();

        Map<String, List<String>> listMap = words.collect(groupingBy(function));

        listMap.toString();

        words.collect(
                groupingBy(function))
                .values().stream()
                .filter(group -> group.size() >= minGroupSize)
                .map(group -> group.size() + ": " + group)
                .forEach(System.out::println);
    }
}
