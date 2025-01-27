package ClassLectures.twentySecondClass;

import java.util.*;

public class ReversePrint {
    public static void main(String[] args) {
        List<Integer> iqram = new ArrayList<>(List.of(1, 2, 3, 6, 3, 67, 7834, 1346, 3567, 1345, 6));

        for (int i : iqram) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        Collections.sort(iqram);
        Collections.reverse(iqram);

        for (int i : iqram) {
            System.out.printf("%d ", i);
        }

        System.out.println();
        Set<Integer> integers = Set.copyOf(iqram);
        for (int i : integers) {
            System.out.printf("%d ", i);
        }

        ListIterator<Integer> integerListIterator = iqram.listIterator();
        while(integerListIterator.hasPrevious())
            System.out.print(integerListIterator.previous() + " ");
    }
}
