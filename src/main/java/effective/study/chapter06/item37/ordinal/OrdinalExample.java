package effective.study.chapter06.item37.ordinal;

import effective.study.chapter06.item37.Plant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class OrdinalExample {

    public static void main(String[] args) {

        Plant[] gargen = new Plant[]{
            new Plant("하루살이", Plant.LifeCycle.BIENNIAL),
            new Plant("두루살이", Plant.LifeCycle.BIENNIAL)
        };

        Set<Plant>[] plantByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

        for (int i = 0; i < plantByLifeCycle.length; i++) {
            plantByLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : gargen) {
            plantByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

/*        for (int i = 0; i < plantByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n",
                    Plant.LifeCycle.values()[i], plantByLifeCycle[i]);
        }*/

        //스트림을 사용한 코드
        System.out.println(
                Arrays.stream(gargen).collect(groupingBy(plant -> plant.lifeCycle))
        );
    }
}
