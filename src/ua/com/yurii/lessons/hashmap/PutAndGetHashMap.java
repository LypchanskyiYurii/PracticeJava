package ua.com.yurii.lessons.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PutAndGetHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.get(10));

        map.put(1, "One + one");
        System.out.println(map);
    }
}
