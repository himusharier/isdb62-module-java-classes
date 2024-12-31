package ClassPracticeFiles.Class_31_12_2024;

public class BoxGenerics<T> {
    private T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        BoxGenerics<Integer> integerBoxGenerics = new BoxGenerics<>();
        BoxGenerics<String> stringBoxGenerics = new BoxGenerics<>();
    }
}
