package ClassLectures.twentySecondClass;

public class StaticBlock {
    static int a = 5;
    static int b;
    static String name;
    static int initialValue;

    static {
        a = 10;
        name = "Zakaria";
        initialValue = 1000;
    }

    public int c = 1234;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        System.out.println(initialValue);
        StaticBlock iqram = new StaticBlock();
        System.out.println(StaticBlock.initialValue);
        System.out.println(iqram.initialValue);

        System.out.println(iqram.c);
    }

}
