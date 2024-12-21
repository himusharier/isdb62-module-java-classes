package PracticeProjects.autoMobiles;

public sealed abstract class Vehicle implements VehicleInterface permits Bike {
    private String vehicleLicenseNumber;
    private String vehicleManufacturedBy;
    private String vehicleType;
    private String vehicleModel;

    //another abstract methods for child class:
    public abstract String fuelType();
    public abstract int fuelTankCapacity();

    //getter and setter:
    public String getVehicleLicenseNumber() {
        return vehicleLicenseNumber;
    }

    public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
        this.vehicleLicenseNumber = vehicleLicenseNumber;
    }

    public String getVehicleManufacturedBy() {
        return vehicleManufacturedBy;
    }

    public void setVehicleManufacturedBy(String vehicleManufacturedBy) {
        this.vehicleManufacturedBy = vehicleManufacturedBy;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleLicenseNumber='" + vehicleLicenseNumber + '\'' +
                ", vehicleManufacturedBy='" + vehicleManufacturedBy + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                '}';
    }
}
