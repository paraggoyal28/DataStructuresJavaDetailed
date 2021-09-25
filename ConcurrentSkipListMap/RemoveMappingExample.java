package ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class RemoveMappingExample {
    public static void main(String args[]) {
        // Initializing the map
        ConcurrentSkipListMap<Integer, Integer> cslm = new ConcurrentSkipListMap<Integer, Integer>();

        // Adding elements to the map
        for (int i = 1; i <= 6; ++i)
            cslm.put(i, i);

        // remove() operation on the map
        cslm.remove(5);

        // print the modified map
        System.out.println("After remove(): " + cslm);

        // remove the first mapping and then print it
        System.out.println("pollFirstEntry: " + cslm.pollFirstEntry());

        // remove the last mapping and then print it
        System.out.println("pollLastEntry: " + cslm.pollLastEntry());

        // Print the final map
        System.out.println("map contents: " + cslm);

    }
}
