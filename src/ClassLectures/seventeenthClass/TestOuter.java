package ClassLectures.seventeenthClass;

public class TestOuter {
    public static void main(String[] args) {
        // Create an instance of OuterClass
        OuterClass outer = new OuterClass();

        // Demonstrate InnerClass functionality
        outer.showInnerClassDemo();

        OuterClass.InnerClass innerClass = outer.new InnerClass();
        innerClass.displayMessage();
    }
}
