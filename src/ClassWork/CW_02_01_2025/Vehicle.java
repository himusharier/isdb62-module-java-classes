package ClassWork.CW_02_01_2025;

public class Vehicle {
    void speedUp() {
        System.out.println("speed up from vehicle class");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();

        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
    }
}
