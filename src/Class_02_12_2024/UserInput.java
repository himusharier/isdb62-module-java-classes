package Class_02_12_2024;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a value:");
        //sc.next();
        rasel();
    }

    public static void rasel() {
        System.out.println("Rasel");
        //double rand = Math.random()*100;
        int rand = (int) (Math.random()*100);
        System.out.println(rand);
    }
}
