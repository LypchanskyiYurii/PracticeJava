package ua.com.yurii.lessons.setinterface;

import java.util.*;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person = new Person(1, "Mike");
        Person person1 = new Person(1, "Mike");

        map.put(person, "123");
        map.put(person1,"321");

        set.add(person);
        set.add(person1);

        System.out.println(map);
        System.out.println(set);
    }
}

