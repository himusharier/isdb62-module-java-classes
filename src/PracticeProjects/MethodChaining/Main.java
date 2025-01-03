package PracticeProjects.MethodChaining;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2).add(3).sub(1).mul(10).output();
    }
}
