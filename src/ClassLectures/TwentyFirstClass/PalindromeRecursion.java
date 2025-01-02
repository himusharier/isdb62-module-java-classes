package ClassLectures.TwentyFirstClass;

public class PalindromeRecursion {
    public static boolean isPalindrome(String name, int start, int end) {
        char iqram = name.charAt(start);
        char hemel = name.charAt(end);

        if (start >= end)
            return true;

        if (iqram != hemel)
            return false;
        else
            return isPalindrome(name, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "8888888888888v8888888888888";

        boolean palindrome = isPalindrome(s, 0, s.length() - 1);

        if (palindrome)
            System.out.printf("%s is palindrome", s);
        else
            System.out.printf("%s is not palindrome", s);
    }
}
