package ClassLectures.fourteenthClass;

import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Test case with invalid age
            validateAge(16);
        } catch (ParvesException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            // Test case with valid age
            validateAge(20);
        } catch (ParvesException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        callViaAnotherMethod(1, "Test text");
        validateAge(33);
    }

    public static void callViaAnotherMethod(int age, String txt) {
        System.out.println(txt);
        validateAge(32);
    }

    // Method that declares an exception using 'throws'
    public static void validateAge(int age) throws ParvesException, NullPointerException {
        if (age == 0) {
            throw new NullPointerException("Age can not e 0");
        } else if (age < 18) {
            // Throwing an exception using 'throw'
            throw new ParvesException("Age must be 18 or above to register!");
        } else {
            System.out.println("Registration successful!");
        }
    }

    // Method declares that it throws an exception
    public static void riskyMethod() throws IOException {
        throw new IOException("Something went wrong!");
    }

    // Caller declares the exception instead of handling it
    public static void callerMethod() {
        try {
            riskyMethod(); // No enforcement to handle it here
        } catch (IOException e) {
            System.out.println("xxx");
        }
    }
}
