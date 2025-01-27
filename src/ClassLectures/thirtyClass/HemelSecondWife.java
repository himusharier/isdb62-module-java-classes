package ClassLectures.thirtyClass;

public class HemelSecondWife extends Hemel implements Nahid, Meme {
    private boolean willHemelGetPriority;

    public HemelSecondWife() {
    }

    public HemelSecondWife(boolean willHemelGetPriority) {
        this.willHemelGetPriority = willHemelGetPriority;
    }

    @Override
    public void rideRoyalEnfield() {
        System.out.println("Rides bike with Nahid vai instead of Hemel");
    }

    @Override
    public void swimInThePool() {
        if (willHemelGetPriority)
            System.out.println("Nijer pukure satar kate");
        else
            System.out.println("Baper barir pukure satar kate");
    }

    public void vojonAtRestaurant() {
        System.out.println("This time she went on her own");
    }

    @Override
    public void hasSisterArrived() {
        System.out.println("No she did not arrived");
    }
}
