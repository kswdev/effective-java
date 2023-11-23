package effective.study.chapter02.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {

    public static void main(String[] args) {
        try {
            //리플렉션을 이용해 기본 생성자 접근
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            //private 한 생성자에 접근 허용
            defaultConstructor.setAccessible(true);
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            System.out.println(elvis1 == elvis2);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
