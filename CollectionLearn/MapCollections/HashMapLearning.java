/*HashMap - элементы-пара - ключ\значение. Методы работают очень быстро*/
package CollectionLearn.MapCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Albert");
        map.put(22, "Bob");
        map.put(35, "Charlie");
        map.put(4, "David");
        System.out.println(map);

        map.put(5, "David");
        System.out.println(map);

        map.put(10, "Greg");
        System.out.println(map);

        map.put(null, "John");
        System.out.println(map);

        map.put(10, null);
        System.out.println(map);

        map.putIfAbsent(5, "Holly");  // Если значение по этому ключу = null, тогда объект перезаписывается
        System.out.println(map);

        System.out.println(map.get(5));
        map.remove(5);
        System.out.println(map.containsValue("Jane"));
        System.out.println(map.containsKey(10));

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
