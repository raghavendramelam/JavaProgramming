package Collections;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;;

public class map {
    private static Set<Entry<Integer, String>> entrySet;
    private static Collection<String> values;

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "hi");
        map.put(3, "hry dng");
        map.put(1, "david");
        System.out.println(map.size());
        System.out.println(map.containsValue("hi"));
        System.out.println(map.isEmpty());
        System.out.println(map);
        Set<Integer> keyset = map.keySet();
        for (Integer key : keyset) {
            System.out.println(map.get(key));
        }
        System.out.println(map.get(1));
        System.out.println(map.values());
        Set<Entry<Integer, String>> entrySet = map.entrySet();

        Iterator<Entry<Integer, String>> itr = entrySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(map.entrySet());

        Collection<String> values = map.values();
    }
}
