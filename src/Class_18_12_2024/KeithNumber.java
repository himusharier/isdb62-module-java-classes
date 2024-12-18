package Class_18_12_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class KeithNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.nextLine(); //taking input

        ArrayList<Character> numberArray = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            numberArray.add(number.charAt(i)); //make an arraylist and add digits
        }
        //System.out.println(numberArray);

        int nthNumber = number.length();
        int target = Integer.parseInt(number);
        //System.out.println(target);

        int total = 0;
        for (int j = 0; j < nthNumber; j++) {
            total += numberArray.get(j);
        }
        System.out.println(total);

    }
}
