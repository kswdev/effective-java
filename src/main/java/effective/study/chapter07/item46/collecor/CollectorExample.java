package effective.study.chapter07.item46.collecor;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class CollectorExample {

    public static void main(String[] args) {
        //toMap


    }

    private static final Map<String, Collection<String>> stringToEnum (Map<String, String> map) {
        return  Stream.of(map.values()).collect(
                    toMap(Object::toString, e -> e));
    }

}
