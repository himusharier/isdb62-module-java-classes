package ClassLectures.fithClass;

public class RandomCharacter {

    public static char getRandomCharacter(char ch1, char ch2) {
        int i = ch2 - ch1 + 1;
        double v = ch1 + Math.random() * i;
        return (char) v;
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomDigit() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

    public static char getRandomCharacter(int i, char j) {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

    public static char getRandomCharacter(char hemel, char himu, boolean isBangla) {
        return getRandomCharacter(hemel, himu);
    }
}
