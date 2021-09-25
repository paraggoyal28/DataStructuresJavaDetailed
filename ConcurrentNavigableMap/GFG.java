package ConcurrentNavigableMap;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class GFG {
    public static void main(String args[]) {
        ConcurrentNavigableMap<Integer, String> cnmap = new ConcurrentSkipListMap<Integer, String>();

        // Add elements using put() method
        cnmap.put(1, "First");
        cnmap.put(2, "Second");
        cnmap.put(3, "Third");
        cnmap.put(4, "Fourth");

        // Print the contents on the console
        System.out.println("Mappings of the ConcurrentNavigableMap :  " + cnmap);

        System.out.println("HeadMap(3): " + cnmap.headMap(3));

        System.out.println("TailMap(3): " + cnmap.tailMap(3));

        System.out.println("SubMap(1, 3): " + cnmap.subMap(1, 3));

    }
}
