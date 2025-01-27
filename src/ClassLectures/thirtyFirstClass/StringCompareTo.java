package ClassLectures.thirtyFirstClass;

public class StringCompareTo {
    public static void main(String[] args) {
        String hemel = "Hemel";
        String hemel1 = new String("Hemel");
        String zahid = "Zahid";
        String hemem = "Hemem";

        int i = hemel.compareTo(hemel1);
        System.out.println(i);
        int i1 = hemel.compareTo(hemem);
        System.out.println(i1);
        int i2 = hemel1.compareTo(zahid);
        System.out.println(i2);
    }
}
