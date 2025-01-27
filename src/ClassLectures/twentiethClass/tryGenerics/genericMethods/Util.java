package ClassLectures.twentiethClass.tryGenerics.genericMethods;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

        boolean he = p1.getKey().equals(p2.getKey());
        boolean hisWife = p1.getValue().equals(p2.getValue());

        return he && hisWife;
    }
}
