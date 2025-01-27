package ClassLectures.fiftinthClass;

import java.util.ArrayList;

public class CheckCompareTo {
    public static void main(String[] args) {
        // compareInteger();
        // compareStringCheck();

        ArrayList<String> iqram = new ArrayList<>(); // abc

        iqram.add("One");
        iqram.add("Two");
        iqram.add("Three");

        ArrayList<String> himel = iqram; // abc
        himel.add("Four");

        @SuppressWarnings("unchecked")
        ArrayList<String> zahid = (ArrayList<String>) iqram.clone(); // xyz
        zahid.add("Five");

        System.out.println(iqram);
        System.out.println(zahid);
    }

    private static void compareStringCheck() {
        String s = new String("abc");
        String s1 = new String("def");
        String s2 = new String("222");

        System.out.println(s.compareTo(s1));
        System.out.println(s.compareTo(s2));
        System.out.println(s1.compareTo(s2));
    }

    private static void compareInteger() {
        Integer i = 1;
        Integer i1 = 34;
        Integer i2 = 34;
        Integer i3 = 22;

        System.out.println(i.compareTo(i1)); // -1
        System.out.println(i2.compareTo(i1)); // 0
        System.out.println(i2.compareTo(i3)); // 1
    }
}
