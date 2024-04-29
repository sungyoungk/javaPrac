package javaPrac.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CheckTreeMap {
    public static void main(String[] args) {
        CheckTreeMap sample = new CheckTreeMap();
    }

    public void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("E", "e");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> data : entries) {
            System.out.println(data.getKey() + " = " + data.getValue());
        }
    }
}
