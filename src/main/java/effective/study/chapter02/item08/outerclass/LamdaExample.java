package effective.study.chapter02.item08.outerclass;

import java.lang.reflect.Field;

public class LamdaExample {

    private int value = 10;

    private Runnable instanceLamda = () -> {
        System.out.println(value);
    };

    private void printConstrouctor() {
        LamdaExample example = new LamdaExample();
        Field[] declaredFields = example.instanceLamda.getClass().getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println("field type : " + field.getType());
            System.out.println("field name : " + field.getName());
        }
    }
}
