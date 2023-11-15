package effective.study.chapter01.item03.methodreference;

import java.util.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Person {

    LocalDate birthday;

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 13)));
        people.add(new Person(LocalDate.of(2011, 3, 22)));
        people.add(new Person(LocalDate.of(2013, 1, 28)));

        people.sort(Person::compareByAge);
    }
}
