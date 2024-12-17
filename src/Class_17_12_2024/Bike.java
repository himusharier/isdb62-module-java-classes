package Class_17_12_2024;

public class Bike extends Vehicle {

    public Bike(String engineBrand, int seatNumber, int numberOfWheel) {
        super(engineBrand, seatNumber, numberOfWheel);
    }

    public Bike() {

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
