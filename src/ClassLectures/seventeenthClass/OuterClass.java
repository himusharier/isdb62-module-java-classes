package ClassLectures.seventeenthClass;

class OuterClass {
    private String outerField = "Hello from Outer Class!";

    // Nested Inner Class
    class InnerClass {
        public void displayMessage() {
            // Accessing private field of Outer Class
            System.out.println(outerField);
        }
    }

    // Method to demonstrate creating an instance of InnerClass
    public void showInnerClassDemo() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
}


