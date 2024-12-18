package ClassLectures.sixthClass;

public class VariableArguments {
    public static void main(String[] args) {
        int number = biggestNumberByStudent(567, 567, 13);
        System.out.println(number);

        int biggestNumber = biggestNumber(455, 455, 134);
        System.out.println(biggestNumber);

        int biggested = biggestNumber(124, 1254, 124, 246, 346, 58729);
        System.out.println(biggested);
    }

    public static int biggestNumberByStudent(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3)
            return n1;
        else if (n2 >= n1 && n2 >= n3)
            return n2;
        else
            return n3;
    }

    public static int biggestNumber(int n1, int n2, int n3) {
        return Math.max(Math.max(n1, n2), n3);
    }

    public static int biggestNumber(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
