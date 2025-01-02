package ClassLectures.TwentyFirstClass;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> iqram = new ArrayList<>();
        iqram.add(0, 10);
        iqram.add(1, 20);
        iqram.add(2, 30);
        iqram.add(1, 15);
        iqram.set(1, 200);

        System.out.println("Array list is " + iqram);
        System.out.println("Second element in array " + iqram.get(1));
        System.out.println("Third element in array " + iqram.get(2));

        for (int n : iqram) {
            System.out.println("Array list is " + n);
        }

        Iterator<Integer> kk = iqram.iterator();
        while (kk.hasNext()) {
            System.out.println("array list is " + kk.next());
        }

        int x = iqram.size();
        System.out.println("array list size is " + x);

        iqram.remove(1);
        System.out.println("after remove " + iqram);

        // iqram.clear();
        System.out.println("after clear " + iqram);

        boolean a = iqram.isEmpty();
        System.out.println("after clear it now empty " + a);

        boolean v = iqram.contains(20);
        System.out.println(v);

        int in = iqram.indexOf(20);
        System.out.println(in);
    }
}
