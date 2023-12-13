package effective.study.chapter06.item37.enumMap;

import effective.study.chapter06.item37.Plant;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class MapExample {

    public static void main(String[] args) {

        Plant[] garden = new Plant[]{
                new Plant("하루살이", Plant.LifeCycle.BIENNIAL),
                new Plant("두루살이", Plant.LifeCycle.BIENNIAL)
        };

        Map<Plant.LifeCycle, Set<Plant>> plantByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantByLifeCycle.put(lc, new HashSet<>());
        }

        for (Plant p : garden) {
            plantByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(
                Arrays.stream(garden)
                        .collect(groupingBy(plant -> plant.lifeCycle,
                                () -> new EnumMap<>(Plant.LifeCycle.class), toSet()))
        );
    }
}
