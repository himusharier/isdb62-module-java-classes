package HomeWork;

import java.util.Arrays;

public class LetterCounter {
    public static void main(String[] args) {
        String sentence = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";

        int[] letterArrayAZ = new int[26];
        char[] sentenceCharArray = sentence.toLowerCase().toCharArray();
        for (char letter : sentenceCharArray) {
            if (letter < 97 || letter > 122) continue;
            int index = letter % 97;
            letterArrayAZ[index]++;
        }
        //System.out.println(Arrays.toString(letterArrayAZ));
        for (int i = 0; i < letterArrayAZ.length; i++) {
            if (i != 0 && i % 10 == 0) {
                System.out.println();
            }
            char letter = (char) (i + 97);
            //if (letterArrayAZ[i] > 0) {
                System.out.print(letter + "(" + letterArrayAZ[i] + "), ");
            //}
        }
    }
}
