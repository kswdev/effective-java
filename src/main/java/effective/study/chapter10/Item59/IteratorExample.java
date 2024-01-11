package effective.study.chapter10.Item59;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class IteratorExample {

    public static void main(String[] args) {

        Mountain [] range = new Mountain[3];
        range[0] = new Mountain();
        range[1] = new Mountain();
        range[2] = new Mountain();

        Collection<Mountain> collection = Arrays.stream(range).toList();

        try {
            Iterator<Mountain> i = collection.iterator();
            while (true) {
                Mountain m = i.next();
                m.climb();
            }
        } catch (NoSuchElementException e) {}

        for (Iterator<Mountain> i = collection.iterator(); i.hasNext();) {
            Mountain m = i.next();
            m.climb();
        }
    }
}
