package HomeWork;

public class PasswordGeneratorBeta {
    public static void main(String[] args) {
        // enter password length in the following method:
        System.out.println(passwordGenerator(8));
    }

    public static char generateLowerCaseCharacter() {
        return generateCharacter('a', 'z');
    }

    public static char generateUpperCaseCharacter() {
        return generateCharacter('A', 'B');
    }

    public static char generateDigitCharacter() {
        return generateCharacter('0', '9');
    }

    public static char generateSpecialCharacter() {
        return generateCharacter('!', '+');
    }

    public static char generateCharacter(char starPoint, char endPoint) {
        return (char) (starPoint + Math.random() * (endPoint - starPoint + 1));
    }

    public static String passwordGenerator(int length) {
        String password = "";
        int i = 0;
        while (i <= length) {
            if (i < length) {
                password += generateLowerCaseCharacter();
                i++;
            } else {
                break;
            }
            if (i < length) {
                password += generateUpperCaseCharacter();
                i++;
            } else {
                break;
            }
            if (i < length) {
                password += generateDigitCharacter();
                i++;
            } else {
                break;
            }
            if (i < length) {
                password += generateSpecialCharacter();
                i++;
            } else {
                break;
            }
        }
        return password;
    }
}
