package ClassLectures.thirteenthClass.PageFourThirty;

public class CheckInstances {
    public static void main(String[] args) {
//        Fruit fruit = new Fruit();
//        McIntosh mcIntosh = new McIntosh();
        Apple apple = new Apple();
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        System.out.println("a) Is fruit instance of Fruit? -> " + (fruit instanceof Fruit));
        System.out.println("b) Is fruit instance of Orange? -> " + (fruit instanceof Orange));
        System.out.println("c) Is fruit instance of Apple? -> " + (fruit instanceof Apple));
        System.out.println("d) Is fruit instance of GoldenDelicious? -> " + (fruit instanceof GoldenDelicious));
        System.out.println("e) Is fruit instance of  McIntosh? -> " + (fruit instanceof McIntosh));
        System.out.println("f) Is orange instance of Orange? -> " + (orange instanceof Orange));
        System.out.println("g) Is orange instance of Fruit? -> " + (orange instanceof Fruit));
        // System.out.println("h) Is orange instance of Apple? -> (no! giving compile-time error.)" + (orange instanceof Apple) + ".");
        System.out.println("i.1) fruit invoking method in Apple class -> (not possible)" + Apple.makeAppleCider());
        System.out.println("i.2) orange invoking method in Apple class -> " + apple.makeAppleCider());
        System.out.println("j.1) orange invoking method in Orange class -> " + orange.makeOrangeJuice());
        System.out.println("j.2) fruit invoking method in Orange class -> (not possible)"/* + fruit.makeOrangeJuice()*/);
        System.out.println("k) (illegal)");
        // Orange p = new Apple();
        System.out.println("l) (illegal)");
        // McIntosh p = new Apple();
        System.out.println("m) (legal)");
        Apple p = new McIntosh();
    }
}
