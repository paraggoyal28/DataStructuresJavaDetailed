package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CopyDemo {
    public static void main(String args[]) {
        ArrayList<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            if (s.equals("B")) {
                itr.remove();
            }
        }
        System.out.println(l);
    }
}
