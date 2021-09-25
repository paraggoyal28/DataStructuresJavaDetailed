package ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class AddingMappingExample {
    public static void main(String args[]) {
        // Initializing the map
        ConcurrentSkipListMap<Integer, Integer> cslm = new ConcurrentSkipListMap<Integer, Integer>();

        // Adding elements to the map
        for (int i = 1; i <= 9; ++i) {
            cslm.put(i, i);
        }

        // put() operation on the map
        System.out.println("After put: " + cslm);
    }
}
