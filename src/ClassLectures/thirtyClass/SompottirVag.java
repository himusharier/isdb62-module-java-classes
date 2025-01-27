package ClassLectures.thirtyClass;

public class SompottirVag {

    public static void main(String[] args) {
        Hemel hemel = new Hemel();
        hemel.hasGorurBebsha();

        HemelFirstWife hemelFirstWife = new HemelFirstWife();
        hemelFirstWife.hasGorurBebsha();

        HemelSecondWife hemelSecondWife = new HemelSecondWife();
        hemelSecondWife.rideRoyalEnfield();
        hemelSecondWife.swimInThePool();

        HemelSecondWife hemelSecondWife1 = new HemelSecondWife(true);
        hemelSecondWife1.swimInThePool();
    }
}
