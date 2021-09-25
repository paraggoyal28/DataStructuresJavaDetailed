package CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyDemoCopyArray extends Thread {
    static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();

    public static void main(String args[]) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");
        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);
            if (s.equals("B")) {
                // Throws RuntimeException
                itr.remove();
            }
            Thread.sleep(1000);
        }
        System.out.println(l);
    }
}
