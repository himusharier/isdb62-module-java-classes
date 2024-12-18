package ClassLectures.sixthClass;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int[] marks = new int[14];
        marks[0] = 5;
        marks[2] = 5;
        marks[13] = 23;

        String[] names = {"Iqramul", "Omar", "Himu", "Rasel", "Zakaria", "Faysal"
                , "Zahid", "Hemel", "Meme", "Bithy", "Saima", "Farzana", "Ashik", "Nahid"};
        // names[13] = "Sambadik";
        System.out.println(names[13]);
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(new String[]{"hello", "Wrold"}));

        System.out.println(marks[13]);

        System.out.println("Common for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }

        System.out.println();
        System.out.println("For each");
        System.out.print("[");
        String st = "";
        for (int m : marks) {
            // System.out.print(m + ", ");
            st = st + m + ", ";
        }
        st = st.substring(0, st.length() - 2);
        System.out.print(st);
        System.out.print("]");

        System.out.println();
        System.out.println("Print with Arrays class");
        String toStringMarks = Arrays.toString(marks);
        System.out.println(toStringMarks);

        System.out.println(marks.length);

        System.out.println(toStringMarks.length());
    }
}
