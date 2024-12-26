package ClassPracticeFiles.Class_21_12_2024.automobiles;

import ClassPracticeFiles.Class_21_12_2024.VehicleInterface;

public sealed abstract class Vehicle implements VehicleInterface permits Car, Bike{
    protected boolean isRunning;

    public void isRunning() {
        if (isRunning) {
            System.out.println("running");
        } else {
            System.out.println("not running");
        }
    }

    public abstract void implementBreak();
}
