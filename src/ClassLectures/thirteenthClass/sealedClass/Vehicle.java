package ClassLectures.thirteenthClass.sealedClass;

public sealed abstract class Vehicle implements VehicleInterface permits Car, Bike {
    protected boolean isRunning;

    public void isRunning() {
        if (isRunning) {
            System.out.println("Running");
        } else {
            System.out.println("Not Running");
        }
    }

    public abstract void implementBreak();
}
