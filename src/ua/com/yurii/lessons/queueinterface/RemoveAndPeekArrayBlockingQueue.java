package ua.com.yurii.lessons.queueinterface;

import ua.com.yurii.lessons.setinterface.Person;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class RemoveAndPeekArrayBlockingQueue {
    public static void main(String[] args) {
        Person person5 = new Person(54, "Bred");
        Person person1 = new Person(3, "Tom");
        Person person2 = new Person(100, "Cross");
        Person person3 = new Person(18, "Bob");
        Person person4 = new Person(86, "Gerri");

        Queue<Person> people = new ArrayBlockingQueue<Person>(10);
        people.add(person4);
        people.add(person1);
        people.add(person3);
        people.add(person2);
        people.add(person5);

        System.out.println(people);
        System.out.println("________________________________");

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println("________________________________");

        System.out.println(people);
    }
}
