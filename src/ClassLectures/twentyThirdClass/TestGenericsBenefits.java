package ClassLectures.twentyThirdClass;

import java.util.Date;

public class TestGenericsBenefits {
    public static void main(String[] args) {
        Comparable iqram = new Date();
        System.out.println(iqram.compareTo("Hello"));

        Comparable<Date> date = new Date();
        // System.out.println(date.compareTo("Hello"));

        GenericStack<String> stack = new GenericStack<>();
        stack.push("London");
        stack.push("Paris");
        stack.push("Berlin");
        stack.push("Dhaka");

        System.out.println(stack);
    }
}
