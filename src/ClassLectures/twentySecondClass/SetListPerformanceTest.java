package ClassLectures.twentySecondClass;

import java.util.*;

public class SetListPerformanceTest {
    static final int N = 50000;

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        // Shuffle the list
        Collections.shuffle(list);

        // Test HashSet
        Collection<Integer> set1 = new HashSet<>(list);
        System.out.println("Member test time for HashSet is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove element time for HashSet is " + getRemoveTime(set1) + " milliseconds");

        // Test LinkedHashSet
        Collection<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("Member test time for LinkedHashSet is " + getTestTime(set2) + " milliseconds");
        System.out.println("Remove element time for LinkedHashSet is " + getRemoveTime(set2) + " milliseconds");

        // Test TreeSet
        Collection<Integer> set3 = new TreeSet<>(list);
        System.out.println("Member test time for TreeSet is " + getTestTime(set3) + " milliseconds");
        System.out.println("Remove element time for TreeSet is " + getRemoveTime(set3) + " milliseconds");

        // Test ArrayList
        Collection<Integer> list1 = new ArrayList<>(list);
        System.out.println("Member test time for ArrayList is " + getTestTime(list1) + " milliseconds");
        System.out.println("Remove element time for ArrayList is " + getRemoveTime(list1) + " milliseconds");

        // Test LinkedList
        Collection<Integer> list2 = new LinkedList<>(list);
        System.out.println("Member test time for LinkedList is " + getTestTime(list2) + " milliseconds");
        System.out.println("Remove element time for LinkedList is " + getRemoveTime(list2) + " milliseconds");
    }

    // Method to measure the time for membership test (contains)
    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            c.contains((int) (Math.random() * 2 * N));
        }
        return System.currentTimeMillis() - startTime;
    }

    // Method to measure the time for removal operation
    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            c.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}
