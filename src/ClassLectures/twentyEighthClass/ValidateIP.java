package ClassLectures.twentyEighthClass;

import java.util.Scanner;

public class ValidateIP {
    public static final String pattern =
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?(\\.|$)){4}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an IP address:");

        String ipAddress = scanner.nextLine();

        if (ipAddress.matches(pattern)) {
            System.out.println(ipAddress + " is a valid IP address.");
        } else {
            System.out.println(ipAddress + " is not a valid IP address.");
            System.err.print("Error");
        }
    }
}
