package ClassLectures.twentiethClass.tryGenerics;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("Even", 123);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");
        Pair<Integer, String> p3 = new OrderedPair<Integer, String>(12, "world");
        OrderedPair<String, Box<Boolean>> abc = new OrderedPair<>("abc", new Box<Boolean>());

        OrderedPair<String, Box<String>> p = new OrderedPair<>("primes", new Box<String>());

        // Parameterized type
        Box<Integer> intBox = new Box<>();

        // Raw type
        // A non-generic class or interface type is not a raw type.
        // @SuppressWarnings("rawtypes")
        Box rawBox = new Box();

        Box<String> stringBox = new Box<>();
        Box rawBox1 = stringBox;            // OK

        Box rawBox2 = new Box();            // rawBox is a raw type of Box<T>
        Box<Integer> intBox1 = rawBox2;     // warning: unchecked conversion

        Box<String> stringBox1 = new Box<>();
        Box rawBox3 = stringBox1;
        rawBox3.set(8);                     // warning: unchecked invocation to set(T)
        rawBox3.set("string");                     // warning: unchecked invocation to set(T)

    }
}
