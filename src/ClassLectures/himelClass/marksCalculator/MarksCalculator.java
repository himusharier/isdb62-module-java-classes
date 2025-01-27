package ClassLectures.himelClass.marksCalculator;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mid-month exam marks: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter your monthly exam marks: ");
        double num2 = scanner.nextDouble();

        double sumMarks =  (num1 * 0.2) + (num2*0.8);

        if (sumMarks>=30 && sumMarks<=50){
            System.out.println("Congrats you are passed!🤩🤩\nYour mark is: "+ sumMarks);
        }else if (sumMarks>=0 && sumMarks<=29){
            System.out.println("Sorry you are failed!😥😥\nYour mark is: "+sumMarks);
        }else{
            System.out.println("You enter invalid marks! Please enter valid marks");

        }
    }
}

