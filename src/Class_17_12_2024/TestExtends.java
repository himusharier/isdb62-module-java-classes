package Class_17_12_2024;

public class TestExtends extends Vehicle {
    Car car = new Car();

    @Override
    public String engineBrand() {
        return "";
    }

    @Override
    public int seatNumber() {
        return 0;
    }

    @Override
    public int numberOfWheel() {
        return 0;
    }

    VehicleInterface vehicleInterface1 = new Car();
    Vehicle vehicle1 = new Car();
    Object object1 = new Car();


}
