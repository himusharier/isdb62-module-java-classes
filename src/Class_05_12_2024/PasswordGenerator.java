package Class_05_12_2024;

public class PasswordGenerator {
    public static void main(String[] args) {
        final int PASSWORD_LENGTH = 12;

        for (int i = 1; i <= PASSWORD_LENGTH; i++) {
            char lower = RandomCharacter.getRandomLowerCaseCharacter();
            char upper = RandomCharacter.getRandomUpperCaseCharacter();
            char digit = RandomCharacter.getRandomDigitCharacter();
            //char pass = (char) (lower+upper+digit);
            System.out.print(lower);
        }
    }
}
