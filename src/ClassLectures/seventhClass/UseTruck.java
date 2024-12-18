package ClassLectures.seventhClass;

import java.util.Scanner;

public class UseTruck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TruckObject truck = new TruckObject();
        truck.battery = "Rahim Afroz";
        truck.seatCount = 2;


        System.out.println(truck.engine);
        System.out.println(truck.battery);
        System.out.println(truck.wheel);
        truck.startEngine();

        TruckObject truckTwo = new TruckObject();
        System.out.println(truckTwo.battery);
        truckTwo.wheel = "Six wheel";
        System.out.println(truckTwo.wheel);

        TruckObject truckThree = new TruckObject("Ten Wheel");
        System.out.println(truckThree.wheel);

        TruckObject truckFour = new TruckObject(
                "12 wheel",
                "bmw",
                "BMW",
                "Rahim Afroz",
                "Tata",
                "container",
                1,
                "radiator"
        );
        System.out.println(truckFour.container);

        String radiator = TruckObject.radiator;
    }
}
