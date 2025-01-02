package ClassLectures.eighteenthClass;

public class EighteenthClass {
    String name;
    String id;

    public EighteenthClass(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        EighteenthClass aClass = new EighteenthClass("omar", "12");

        System.out.println(aClass);
//        System.out.println(aClass.name);
    }
}
