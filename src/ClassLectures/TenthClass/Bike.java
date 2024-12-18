package ClassLectures.TenthClass;

public class Bike extends Vehicle {
    private boolean hasStand;
    private boolean isChainDriven;

    public Bike() {
        super();
    }

    public Bike(boolean hasStand, boolean isChainDriven) {
        this.hasStand = hasStand;
        this.isChainDriven = isChainDriven;
    }

    public Bike(String engineBrand, int seatNumber, int numberOfWheel, boolean hasStand, boolean isChainDriven) {
        super(engineBrand, seatNumber, numberOfWheel);
        this.hasStand = hasStand;
        this.isChainDriven = isChainDriven;
    }

    public Bike(String engineBrand, int seatNumber, boolean hasStand, boolean isChainDriven) {
        super(engineBrand, seatNumber);
        this.hasStand = hasStand;
        this.isChainDriven = isChainDriven;
    }

    public boolean isHasStand() {
        return hasStand;
    }

    public void setHasStand(boolean hasStand) {
        this.hasStand = hasStand;
    }

    public boolean isChainDriven() {
        return isChainDriven;
    }

    public void setChainDriven(boolean chainDriven) {
        isChainDriven = chainDriven;
    }

    @Override
    public String startEngine() {
        return "Starting bike engine";
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping bike engine");
    }

    @Override
    public String run() {
        return "Driving bike";
    }

//    @Override
//    public String toString() {
//        return "Bike{" +
//                "hasStand=" + hasStand +
//                ", isChainDriven=" + isChainDriven +
//                '}';
//    }
}
