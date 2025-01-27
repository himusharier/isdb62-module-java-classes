package ClassLectures.ninthClass;

import tech.bisew.isdb.eighthClass.computer.Computer;

public class ValueTypeRefType {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        a = b;
        b = 6;

        if (a == b) {
            System.out.printf("\na %d is equal to b %d", a, b);
        } else {
            System.out.printf("\na %d is not equal to b %d", a, b);
        }

        String s1 = "abc";
        String s2 = "bce";
        s1 = s2;
        s2 = "def";

        if (s1 == s2) {
            System.out.printf("\ns1 %s is equal to s2 %s", s1, s2);
        } else {
            System.out.printf("\ns1 %s is not equal to s2 %s\n\n", s1, s2);
        }

        Computer computer1 = new Computer();
        computer1.setKeyboard("asdf");

        Computer computer2 = new Computer();
        computer2.setKeyboard("poiu");
        System.out.println(computer2.getKeyboard());

        computer1 = computer2;
        System.out.println(computer1.getKeyboard());

        computer1.setKeyboard("changed");
        System.out.println(computer2.getKeyboard());

    }
}
