package effective.study.chapter03.item11.hashtable;

import effective.study.chapter03.item11.hashcode.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();
        PhoneNumber number1 = new PhoneNumber(123, 456, 7890);
        PhoneNumber number2 = new PhoneNumber(155, 323, 3434);

        //TODO 같은 인스턴스인데 다른 hashcode
        //다른 인스턴스인데 같은 hashcode를 쓴다면?

        System.out.println(number1.equals(number2));
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());

        map.put(number1,  "son");
        map.put(number2,  "kim");

        //String s = map.get(number2);
        String s = map.get(new PhoneNumber(123, 456, 7890));
        System.out.println(s);
    }
}
