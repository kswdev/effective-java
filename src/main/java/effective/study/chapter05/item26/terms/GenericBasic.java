package effective.study.chapter05.item26.terms;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {

    public static void main(String[] args) {
        //Generic 사용전
        List numbers = new ArrayList();
        numbers.add(10);
        numbers.add("son");

        for (Object number : numbers) {
            System.out.println((Integer) number);
        }

        //Generic 등장 후
        List<Integer> numberss = new ArrayList<>();
        numberss.add(10);
        //numberss.add("son");

        for (Object number : numberss) {
            System.out.println((Integer) number);
        }

    }
}
