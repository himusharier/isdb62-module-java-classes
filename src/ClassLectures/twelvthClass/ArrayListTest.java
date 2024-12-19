package ClassLectures.twelvthClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListTest {
    private int a;
    public int b;
    protected int c;
    int d; // package-protected, default

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(13);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.size());


        LinkedList<String> linkedList = new LinkedList<>();

        Integer[] ints = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(ints));
    }
}
