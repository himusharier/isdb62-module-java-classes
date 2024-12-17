package Class_17_12_2024;

public class Car extends Vehicle {
    private int numberOfDoor;

    public Car(String engineBrand, int seatNumber, int numberOfWheel, int numberOfDoor) {
        super(engineBrand, seatNumber, numberOfWheel);
        this.numberOfDoor = numberOfDoor;
    }

    public Car() {

    }

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
}
