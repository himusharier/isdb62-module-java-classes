package ClassLectures.thirtyClass;

public class HemelFirstWife extends Hemel implements Meme {

    @Override
    public void hasGorurBebsha() {
        System.out.println("Gorur bebshay lal batti");
    }

    private boolean hasOnekGohona;

    public HemelFirstWife() {
    }

    public HemelFirstWife(String landSize, double amountOfMoney, boolean doesEat, boolean hasTwoLeg, String title, boolean hasOnekGohona) {
        super(landSize, amountOfMoney, doesEat, hasTwoLeg, title);
        this.hasOnekGohona = hasOnekGohona;
    }

    public HemelFirstWife(boolean hasOnekGohona) {
        this.hasOnekGohona = hasOnekGohona;
    }

    public boolean isHasOnekGohona() {
        return hasOnekGohona;
    }

    public void setHasOnekGohona(boolean hasOnekGohona) {
        this.hasOnekGohona = hasOnekGohona;
    }

    @Override
    public void hasSisterArrived() {
        System.out.println("She has arrived");
    }
}
