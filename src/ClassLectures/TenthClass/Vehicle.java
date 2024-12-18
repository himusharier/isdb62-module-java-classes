package ClassLectures.TenthClass;

import ClassLectures.TenthClass.interfaceTest.FauInterface;
import ClassLectures.TenthClass.interfaceTest.VehicleInterface;

public abstract class Vehicle implements VehicleInterface, FauInterface {

    private String engineBrand;
    private int seatNumber;
    private int numberOfWheel;

    public Vehicle() {
    }

    public Vehicle(String engineBrand, int seatNumber, int numberOfWheel) {
        this.engineBrand = engineBrand;
        this.seatNumber = seatNumber;
        this.numberOfWheel = numberOfWheel;
    }

    public Vehicle(String engineBrand, int seatNumber) {
        this.engineBrand = engineBrand;
        this.seatNumber = seatNumber;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engineBrand='" + engineBrand + '\'' +
                ", seatNumber=" + seatNumber +
                ", numberOfWheel=" + numberOfWheel +
                '}';
    }


}
