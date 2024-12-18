package ClassLectures.fithClass;

public class TestRandomCharacter {
    public static void main(String[] args) {

        /*final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowerCaseLetter();

            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }*/

        char randomCharacter = RandomCharacter.getRandomCharacter('a', 'z');
        System.out.println(randomCharacter);
        char c = RandomCharacter.getRandomCharacter('\u0985', '\u09DF', true);
        System.out.println(c);
    }
}

