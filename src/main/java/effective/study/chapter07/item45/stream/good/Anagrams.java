package effective.study.chapter07.item45.stream.good;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams {

    public static void main(String[] args) {
        String[] strings = {"abs", "bsa", "dds", "sdd", "cad", "acd", "dul", "sba"};
        int minGroupSize = 2;

        Stream<String> words = Arrays.stream(strings);

        words.collect(
                groupingBy(Anagrams::alphabetize))
                .values().stream()
                .filter(group -> group.size() >= minGroupSize)
                .forEach(System.out::println);
    }

    private static String alphabetize(String s) {
        char [] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
