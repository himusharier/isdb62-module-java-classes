package ClassLectures.thirteenthClass.sealedClass;

public final class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car started");
        super.isRunning = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stopped");
        isRunning = false;
    }

    @Override
    public void implementBreak() {
        System.out.println("Implementing break for car");
    }
}
