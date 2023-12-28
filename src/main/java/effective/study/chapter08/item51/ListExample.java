package effective.study.chapter08.item51;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> subList = list.subList(1, 5);
        subList.indexOf(2);
    }
}
