package ClassWork.CW_02_01_2025;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReversed {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        System.out.println(linkedList);

        System.out.println("-----------------------------------------");

        /*Iterator<String> listIterators = linkedList.descendingIterator();
        while (listIterators.hasNext()) {
            System.out.println(listIterators.next());
        }*/
        Collections.reverse(linkedList);
        for (Object value : linkedList) {
            System.out.println(value);
        }

    }
}
