package HomeWork;

import java.util.Arrays;

public class LetterCounter2 {

    public static void countOccurrence(String sentence) {
        int[] letterArray = new int[26];
        char[] sentenceChrArray = sentence.toLowerCase().toCharArray();
        for (char c : sentenceChrArray) {
            if (c < 97 || c > 122) continue;
            int index = c % 97;
            letterArray[index]++;
        }
        for (int i = 0; i < letterArray.length; i++) {
            char letter = (char) (i + 97);
            System.out.println(letter + " = " + letterArray[i]);
        }
    }

    public static void main(String[] args) {
        countOccurrence("a a b c d e ghgg");
    }
}
