package Class_05_12_2024;

public class RandomCharacter {
    /*public static void main(String[] args) {
        System.out.println(getRandomCharacter());
        System.out.println(getRandomDigitCharacter());
        System.out.println(getRandomUpperCaseCharacter());
        System.out.println(getRandomLowerCaseCharacter());
    }*/

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseCharacter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseCharacter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
