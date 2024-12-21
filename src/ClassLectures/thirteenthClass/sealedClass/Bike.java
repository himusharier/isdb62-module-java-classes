package ClassLectures.thirteenthClass.sealedClass;

public non-sealed class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike started");
        isRunning = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike stopped");
        isRunning = false;
    }

    @Override
    public void implementBreak() {
        System.out.println("Implementing break for bike");
    }
}
