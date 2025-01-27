package ClassLectures.tryGenerics;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());

        // Parameterized type
        Box<Integer> intBox = new Box<>();

        // Raw type
        // A non-generic class or interface type is not a raw type.
        Box rawBox = new Box();

        Box<String> stringBox = new Box<>();
        Box rawBox1 = stringBox;            // OK

        Box rawBox2 = new Box();            // rawBox is a raw type of Box<T>
        Box<Integer> intBox1 = rawBox2;     // warning: unchecked conversion

        Box<String> stringBox1 = new Box<>();
        Box rawBox3 = stringBox1;
        rawBox3.set(8);                     // warning: unchecked invocation to set(T)

    }
}
