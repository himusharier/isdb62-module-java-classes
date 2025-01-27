package ClassLectures.fiftinthClass;

public class Apple extends Fruit implements Edible{

    @Override
    public void howToEat() {
        System.out.println("chabaya khay");
    }

    @Override
    public void flavour() {
        System.out.println("cukka");
    }

    @Override
    public void howToPeel() {
        System.out.println("boti diye");
    }

    public static void main(String[] args) {
        // Fruit fruit = new Fruit();
        Fruit fruit = new Apple();
        // Math math = new Math();
    }

    public Apple() {
    }
}
