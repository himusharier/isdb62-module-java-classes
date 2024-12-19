package ClassLectures.twelvthClass;

public class StringBuilderClass {
    public static void main(String[] args) {
        String s = "idb";
        s += " is good";
        s += " for non IT student";

        System.out.println(s);

        StringBuilder builder = new StringBuilder("idb");
        builder.append(" is good");
        builder.append(" for non IT student");
        System.out.println(builder.toString());
        builder.delete(0, 4);
        System.out.println(builder.toString());

        System.out.println(100/0);

    }
}
