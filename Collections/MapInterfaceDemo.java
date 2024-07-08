import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceDemo {
    public static void main(String[] args) {
        //non-generic
        Map map = new HashMap();

        map.put("name", "ekwinder");
        map.put("phone", 903495344L);
        map.put(1,34.3);
        map.put(true, 1);

        System.out.println(map);

        //Map<String, Integer> scores = new HashMap<>();
        //Map<String, Integer> scores = new LinkedHashMap<>();
        Map<String, Integer> scores = new TreeMap<>();

        scores.put("hindi", 67);
        scores.put("english",78);
        scores.put("history", 45);
        scores.put("science", 56);
        scores.put("maths", 87);

        System.out.println(scores);

        System.out.println(scores.get("english"));

        scores.remove("science");

        System.out.println(scores);

        scores.replace("english", 89);

        System.out.println(scores);

        scores.put("english", 67);

        System.out.println(scores);

        System.out.println(scores.keySet());

        System.out.println(scores.values());
    }
}
