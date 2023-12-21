package effective.study.chapter07.item45;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        String[] strings = {"abs", "bsa", "dds", "sdd", "cad", "acd", "dul", "sba"};
        int minGroupSize = 2;

        Map<String, Set<String>> groups = new HashMap<>();
        Iterator<String> s = Arrays.stream(strings).iterator();

        while (s.hasNext()) {
            String word = s.next();
            groups.computeIfAbsent(alphabetize(word),
                    unused -> new TreeSet<>()).add(word);
        }

        for (Set<String> group : groups.values())
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);
    }

    private static String alphabetize(String s) {
        char [] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
