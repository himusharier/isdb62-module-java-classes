package ClassLectures.fiftinthClass.problemSolving;

import java.util.HashSet;

public class FindCommonElements {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        // Create a HashSet to store common elements.
        HashSet<String> set = new HashSet<>();

        for (String string : array1) {
            for (String s : array2) {
                // Check if elements in array1 and array2 are equal.
                if (string.equals(s)) {
                    // Add the common element to the HashSet.
                    set.add(string);
                }
            }
        }

        System.out.println("Common element : " + set);
    }


}


