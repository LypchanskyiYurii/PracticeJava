package ua.com.yurii.lessons.comparableinterface;

import ua.com.yurii.lessons.setinterface.Person;

import java.util.*;

public class SortListAndSet {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }
    private static void addElements (Collection collection) {
        collection.add(new Person(23, "To"));
        collection.add(new Person(2, "Tomi"));
        collection.add(new Person(100, "Bob"));
        collection.add(new Person(67, "Terminator"));
        collection.add(new Person(200, "Cross"));
    }
}
