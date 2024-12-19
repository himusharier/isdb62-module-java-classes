package Class_19_12_2024;

public class StringBuilderClass {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 += " world";
        System.out.println(s1);

        StringBuilder builder = new StringBuilder("hello");
        builder.append(" world");
        System.out.println(builder.toString());
        System.out.println(builder);

    }
}
