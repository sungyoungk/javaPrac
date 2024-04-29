package javaPrac.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        // sample.checkHashMap();
        // sample.checkValues();
        // sample.checkHashMapEntry();
        sample.checkContains();

    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        Set<String> tempKey = map.keySet();

        for (String data : tempKey) {
            System.out.println(data + " = " + map.get(data));
        }
    }

    public void checkValues() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        Collection<String> values = map.values();

        for (String value : values) {
            System.out.println(value);
        }
    }

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");


        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> data : entries) {
            System.out.println(data.getKey() + " = " + data.getValue());
        }
    }

    public void checkContains() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("z"));
    }
}
