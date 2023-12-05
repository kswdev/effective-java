package effective.study.chapter05.item27.suppress;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample {

    private int size;
    Object[] elements;


    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            /**
             *  T[] 데이터 타입으로 매개변수를 받기 때문에
             *  @SuppressWarnings 애너테이션을 붙여 비검사 경고를 제거한다.
             */
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }

        System.arraycopy(elements, 0, a, 0, size);
        if(a.length > size)
            a[size] = null;
        return a;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
    }
}
