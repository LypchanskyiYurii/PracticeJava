package ua.com.yurii.lessons.comparatorinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
    }
}
