package ClassLectures.secondClass;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your school: ");
        String school = sc.nextLine();

        System.out.println(UserInput.printHi(name, age, school));
        System.out.println("Sum of tow fixed variable is " + UserInput.sum());
        System.out.println("Sum of tow provided variable is " + UserInput.sum(245235, 5234674));
    }

    @SuppressWarnings("unused")
    public static void drawA() {
        System.out.println("   A");
        System.out.println("  A A");
        System.out.println(" AAAAA");
        System.out.println("A     A");
    }

    public static int sum() {
        int a = 2;
        int b = 4;

        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String printHi(String name, int age, String school) {
        return "Hi " + name + "! you are " + age
                + " years young or maybe you are dead and your school name is " + school;
    }
}

