package PracticeProjects.autoMobiles_dummyProject.vehicles;

public class Car extends MotorVehicle {
    private String model;

    public Car(String licenseNumber, String manufacturer, String model) {
        super(licenseNumber, manufacturer);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfWheels() {
        return 4; // Cars typically have 4 wheels
    }

    @Override
    public void start() {
        System.out.println("The car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nModel: " + model;
    }
}
