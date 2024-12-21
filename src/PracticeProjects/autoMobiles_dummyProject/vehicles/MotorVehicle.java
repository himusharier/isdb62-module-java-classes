package PracticeProjects.autoMobiles_dummyProject.vehicles;

public abstract class MotorVehicle implements Vehicle {
    private String licenseNumber;
    private String manufacturer;

    public MotorVehicle(String licenseNumber, String manufacturer) {
        this.licenseNumber = licenseNumber;
        this.manufacturer = manufacturer;
    }

    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getNumberOfWheels();

    @Override
    public String toString() {
        return "License Number: " + licenseNumber + "\n" +
               "Manufacturer: " + manufacturer + "\n" +
               "Number of Wheels: " + getNumberOfWheels();
    }
}
