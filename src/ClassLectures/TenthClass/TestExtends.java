package ClassLectures.TenthClass;

import ClassLectures.TenthClass.interfaceTest.VehicleInterface;

public class TestExtends {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.setEngineBrand("Hyndai");
        bike.setSeatNumber(1);
        bike.setNumberOfWheel(2);
        bike.setHasStand(true);
        bike.setChainDriven(true);

        System.out.println(bike.run());

//        Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle.toString());

        Car car = new Car();
        String startEngine = car.startEngine();
        System.out.println(startEngine);
        System.out.println(car.run());

        Vehicle vehicle = new Car(); //chele
        Vehicle vehicle1 = new Bike();

        VehicleInterface anInterface = new Car(); //bap
        VehicleInterface anInterface1 = new Bike();

        Object o = new Car(); // dada
        Object o1 = new Bike();

        o1 = vehicle1;
        vehicle1 = (Vehicle) o1;

        long a = 2147483700L;
        long b = 12341234;

        int a1 = (int) a;
        int b1 = (int) b;
        
        System.out.println(a1);
        System.out.println(b1);
    }
}
