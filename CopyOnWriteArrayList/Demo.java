package CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String args[]) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Initial iterator
        Iterator<String> itr = list.iterator();
        list.add("GFG");
        System.out.println("List contains: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // iterator after adding an element
        itr = list.iterator();
        System.out.println("List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
