package Java_advance;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(); // hashmap, linkedhashmap, treemap

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put(null,null);

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
