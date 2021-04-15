package ua.com.yurii.lessons.mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class СlassesMapInterface {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        writeAndOut(hashMap);
        System.out.println("_________________");
        writeAndOut(linkedHashMap);
        System.out.println("_________________");
        writeAndOut(treeMap);
        System.out.println("_________________");


    }

    public static void writeAndOut (Map<Integer, String> map) {
        map.put(3, "Mike");
        map.put(0, "Dad");
        map.put(43, "Bob");
        map.put(90, "Kit");
        map.put(22, "Tom");
        map.put(150, "Pilot");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
