package ClassLectures.tryGenerics;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {
        System.out.println("Hello world");
        Box<Integer> integerBox = new Box<>();

        Box<String> stringBox = new Box<>();
    }
}

