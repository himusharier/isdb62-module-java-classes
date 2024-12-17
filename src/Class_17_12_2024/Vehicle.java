package Class_17_12_2024;

public abstract class Vehicle implements VehicleInterface {
    String engineBrand;
    int seatNumber;
    int numberOfWheel;

    public Vehicle() {
        super();
    }

    public Vehicle(String engineBrand, int seatNumber, int numberOfWheel) {
        this.engineBrand = engineBrand;
        this.seatNumber = seatNumber;
        this.numberOfWheel = numberOfWheel;
    }
}
