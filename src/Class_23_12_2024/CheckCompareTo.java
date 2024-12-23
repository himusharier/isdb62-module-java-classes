package Class_23_12_2024;

public class CheckCompareTo {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 34;
        Integer i3 = 34;
        Integer i4 = 22;
        System.out.println(i1.compareTo(i2));
        System.out.println(i2.compareTo(i3));
        System.out.println(i2.compareTo(i4));

        System.out.println("-----------------------------");

        String s1 = new String("abc");
        String s2 = new String("def");
        String s3 = new String("def");
        String s4 = new String("ghi");
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s4));
    }
}
