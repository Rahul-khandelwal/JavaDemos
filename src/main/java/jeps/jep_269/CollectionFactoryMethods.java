package jeps.jep_269;

import java.util.*;

/**
 * JEP 269: Convenience Factory Methods for Collections
 */
public class CollectionFactoryMethods {

    public static void preJava9() {
        // Set
        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);

        // List
        List<String> list = new ArrayList<>();
        set.add("first");
        set.add("second");
        set.add("third");
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        // Map
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
    }

    public static void sinceJava9() {
        Set<String> unmodifiableSet = Set.of("fist", "second", "third");
        List<String> unmodifiableList = List.of("fist", "second", "third");
        Map<String, String> unmodifiableMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
    }
}
