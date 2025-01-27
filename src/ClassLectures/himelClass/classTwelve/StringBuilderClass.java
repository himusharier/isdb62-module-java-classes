package ClassLectures.himelClass.classTwelve;

public class StringBuilderClass {

    public static void main(String[] args) {
        String s = "IsDB";
        s += " is good";
        s += " for non IT Student.";

        System.out.println(s);

        StringBuilder builder = new StringBuilder("IsDB");
        builder.append(" is good");
        builder.append(" for non IT Student.");

        System.out.println(builder);

        builder.delete(0, 4);
        System.out.println(builder);

        //System.out.println(100/0);
    }
}
