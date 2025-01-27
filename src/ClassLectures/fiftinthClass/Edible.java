package ClassLectures.fiftinthClass;

@SuppressWarnings("unused")
public interface Edible {
    void howToEat();

    static void staticMethod() {
        System.out.println("This is a static method");
    }

    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}
