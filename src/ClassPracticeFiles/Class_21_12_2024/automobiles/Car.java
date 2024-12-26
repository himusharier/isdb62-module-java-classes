package ClassPracticeFiles.Class_21_12_2024.automobiles;

public final class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("car started");
        super.isRunning = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("car stopped");
        isRunning = false;
    }

    @Override
    public void implementBreak() {
        System.out.println("implementing break for car");
    }
}
