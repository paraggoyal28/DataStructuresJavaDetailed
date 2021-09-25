package ConcurrentSkipListMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListMap;

public class IteratingExample {
    public static void main(String args[]) {
        // create an instance of ConcurrentSkipListMap
        ConcurrentSkipListMap<Integer, Integer> cslm = new ConcurrentSkipListMap<>();

        // Add mappings using the put method
        for (int i = 0; i < 6; ++i) {
            cslm.put(i, i);
        }

        // Create an Iterator over the
        // ConcurrentSkipListMap
        Iterator<ConcurrentSkipListMap.Entry<Integer, Integer>> itr = cslm.entrySet().iterator();

        while (itr.hasNext()) {
            ConcurrentSkipListMap.Entry<Integer, Integer> entry = itr.next();

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}
