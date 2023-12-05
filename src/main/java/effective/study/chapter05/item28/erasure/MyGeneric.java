package effective.study.chapter05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("son");
        String name = names.get(0);
        System.out.println(name);

/*        String[] names = new String[1];
        names[0] = "son";
        String name = names[0];
        System.out.println(name);*/

/*        List names = new ArrayList();
        names.add("son");
        Object o = names.get(0);
        String name = (String) o;
        System.out.println(name);*/
    }
}
