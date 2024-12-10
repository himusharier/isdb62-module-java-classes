package HomeWork;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        // enter password length in the following method:
        System.out.println(generate(8));
    }

    private static final Random random = new Random();

    public static String generate(int length) {
        StringBuilder s = new StringBuilder();
        while (s.length() < length) {
            s.append(getRandomChar());
        }
        return s.toString();
    }

    private static char getRandomChar() {
        int r = random.nextInt(4);
        return switch (r) {
            case 0 -> generateLowerCaseCharacter();
            case 1 -> generateUpperCaseCharacter();
            case 2 -> generateDigitCharacter();
            case 3 -> generateSpecialCharacter();
            default -> '0';
        };
    }

    private static char generateLowerCaseCharacter() {
        return generateCharacter('a', 'z');
    }

    private static char generateUpperCaseCharacter() {
        return generateCharacter('A', 'B');
    }

    private static char generateDigitCharacter() {
        return generateCharacter('0', '9');
    }

    private static char generateSpecialCharacter() {
        return generateCharacter('!', '+');
    }

    private static char generateCharacter(char starPoint, char endPoint) {
        return (char) random.nextInt(starPoint,endPoint+1);
    }


}
