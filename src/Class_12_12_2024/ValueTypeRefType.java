package Class_12_12_2024;

public class ValueTypeRefType {
    public static void main(String[] args) {
        var a = 1;
        var b = 2;
        a = b;

        System.out.println(a);
        System.out.println(b);

        if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is not equal to b");
        }
    }
}
