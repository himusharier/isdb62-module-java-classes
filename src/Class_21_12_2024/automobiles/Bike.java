package Class_21_12_2024.automobiles;

public non-sealed class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("bike started");
        isRunning = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("bike stopped");
        isRunning = false;
    }

    @Override
    public void implementBreak() {
        System.out.println("implementing break for bike");
    }

}
