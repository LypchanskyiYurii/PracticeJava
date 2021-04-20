package ua.com.yurii.lessons.comparatorinterface;

import ua.com.yurii.lessons.setinterface.Person;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("Frog");
        animals.add("Crocodail");
        animals.add("a");
        animals.add("ra");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Person> people = new ArrayList<>();
        people.add(new Person(21, "Boob"));
        people.add(new Person(5, "Tom"));
        people.add(new Person(120, "Met"));
        people.add(new Person(60, "Track"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);
    }
}
