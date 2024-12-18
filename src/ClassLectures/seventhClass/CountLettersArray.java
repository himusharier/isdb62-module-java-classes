package ClassLectures.seventhClass;

import java.util.Random;

public class CountLettersArray {
    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }

    public static char[] createArray() {
        char[] chars = new char[100];
        Random rand = new Random();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + rand.nextInt(26)); // Generates a random letter between 'a' and 'z'
        }
        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++) {
            // Increment the count for the corresponding letter
            int iqramul = chars[i] - 'a';
            counts[iqramul]++;
        }

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("\nOccurrence of letter %s is %d", (char) (i + 'a'), counts[i]);

        }
    }
}