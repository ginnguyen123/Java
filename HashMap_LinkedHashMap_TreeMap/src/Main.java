import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> linkHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkHashMap.put("Smith", 30);
        linkHashMap.put("Anderson", 31);
        linkHashMap.put("Lewis", 29);
        linkHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkHashMap.get("Lewis"));
    }
}