package ClassLectures.seventhClass;

@SuppressWarnings("unused")
public class TruckObject {
    // variable, properties
    public String wheel;
    private String chassis;
    protected String engine = "Toyota";
    String battery;
    String fuelChamber;
    String container;
    int seatCount;
    protected static String radiator;

    // method
    void startEngine() {
        System.out.println("Started engine");
    }

    // method
    void breakTruck() {
        System.out.println("Implemented Break");
    }

    // method
    private void shiftGear() {
        System.out.println("Shifting gear");
    }

    // No args Constructor
    public TruckObject() {
    }

    // Single Argument constructor
    public TruckObject(String wheel) {
        this.wheel = wheel;
    }

    public TruckObject(String wheel, String chassis, String engine, String battery, String fuelChamber, String container, int seatCount, String radiator) {
        this.wheel = wheel;
        this.chassis = chassis;
        this.engine = engine;
        this.battery = battery;
        this.fuelChamber = fuelChamber;
        this.container = container;
        this.seatCount = seatCount;
        this.radiator = radiator;
    }
}
