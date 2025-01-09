package ClassWork.CW_09_01_2025;

import java.util.Scanner;

public class IpAddressValidator {
    static void ipValidator(String ipAddress) {
        boolean status = false;
        String regexChecker = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        String[] ipDivide = ipAddress.split("\\.");

        if (ipDivide.length != 4) {
            status = false;

        } else {
            for (int i = 0; i < ipDivide.length; i++) {
                if (ipDivide[i].matches(regexChecker)) {
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }
        }

        if (status) {
            System.out.println("ip address valid");
        } else {
            System.out.println("ip address invalid");
        }

    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ip address: ");
        String ipAddress = scanner.nextLine();
        ipValidator(ipAddress);
    }
}
