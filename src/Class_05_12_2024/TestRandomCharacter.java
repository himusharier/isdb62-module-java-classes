package Class_05_12_2024;

public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHAR = 200;
        final int CHAR_PER_LINE = 30;

        for (int i = 1; i <= NUMBER_OF_CHAR; i++) {
            char ch = RandomCharacter.getRandomLowerCaseCharacter();
            //char ch = new RandomCharacter().getRandomLowerCaseCharacter();
            if (i % CHAR_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
