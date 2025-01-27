package ClassLectures.twentiethClass.tryGenerics.boundedTypeParameters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// This is an example of Generics Method
public class BoxDemo {

    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box : boxes) {
            U boxContents = box.get();
            System.out.println("Box #" + counter + " contains [" + boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();

        BoxDemo.addBox(10, listOfIntegerBoxes);
        BoxDemo.addBox(20, listOfIntegerBoxes);
        BoxDemo.addBox(30, listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);


        List<String> listOne = Collections.emptyList();
        List<String> listTwo = Collections.emptyList();
    }

    // Upper Bounded Wildcards
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    // Unbounded Wildcards
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    // Lower Bounded Wildcards
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
