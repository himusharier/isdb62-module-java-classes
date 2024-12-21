package PracticeProjects.autoMobiles_dummyProject;

import PracticeProjects.autoMobiles_dummyProject.vehicles.Car;

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car("AB123CD", "Toyota", "Corolla");
        
        // Display car details
        System.out.println("Car Details:");
        System.out.println(myCar);

        // Start and stop the car
        myCar.start();
        myCar.stop();
    }
}
