package effective.study.chapter07.item46.collecor;

import effective.study.chapter07.item42.Operation;
import effective.study.chapter07.item46.Album;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.counting;

public class CollectorExample {

    public static void main(String[] args) {
        Map<String, Long> freq;
        String[] strings = {"ab", "bsa", "dds", "sdd", "cad", "bsa", "dul", "bsa"};

        Stream<String> stringStream = Arrays.stream(strings);

        Map<String, List<String>> map = stringStream.collect(
                groupingBy(CollectorExample::alphabetize)
        );

        System.out.println(map);

    }

    private static Map<String, Operation> stringToEnum () {
        return Stream.of(Operation.values()).collect(
                    toMap(Object::toString, e -> e));
    }

    private static Map<String, Album> topHits (List<Album> albums) {
        return albums.stream().collect(
                toMap(Album::getArtist, a -> a, BinaryOperator.maxBy(Comparator.comparing(Album::getSales)))
        );
    }

    private static String alphabetize(String s) {
        char [] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
