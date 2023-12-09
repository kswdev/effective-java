package effective.study.chapter05.item33.type_token;


import java.util.*;

public class Favorites {

    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> clazz, T value) {
        this.map.put(Objects.requireNonNull(clazz), clazz.cast(value));
    }

    public <T> T get(Class<T> clazz) {
        return clazz.cast(this.map.get(clazz));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();

        favorites.put((Class)String.class, 2);

        favorites.put(String.class, "son");
        favorites.put(Integer.class, 1);
        favorites.put(List.class, List.of(1, 2, 3));
        favorites.put(List.class, List.of("a", "b", "c"));

        List list = favorites.get(List.class);
        list.forEach(System.out::println);

        System.out.println(favorites.get(String.class));
    }
}
