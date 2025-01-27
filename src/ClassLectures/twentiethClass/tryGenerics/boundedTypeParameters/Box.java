package ClassLectures.twentiethClass.tryGenerics.boundedTypeParameters;

public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }


    public static void main(String[] args) {
        Integer i = 23;
        Float v = 231.142F;
        Box<Integer> integerBox = new Box<>();
        integerBox.set(i);
        integerBox.inspect(i);
        integerBox.inspect(v);
        integerBox.inspect(new NaturalNumber());
        // integerBox.inspect("some text"); // error: this is still String!
    }
}
