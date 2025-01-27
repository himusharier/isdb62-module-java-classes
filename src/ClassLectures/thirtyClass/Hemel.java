package ClassLectures.thirtyClass;

public class Hemel {
    private String landSize;
    private double amountOfMoney;
    private boolean doesEat;
    private boolean hasTwoLeg;
    private String title;

    public Hemel() {
    }

    public Hemel(String landSize, double amountOfMoney, boolean doesEat, boolean hasTwoLeg, String title) {
        this.landSize = landSize;
        this.amountOfMoney = amountOfMoney;
        this.doesEat = doesEat;
        this.hasTwoLeg = hasTwoLeg;
        this.title = title;
    }

    public String getLandSize() {
        return landSize;
    }

    public void setLandSize(String landSize) {
        this.landSize = landSize;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public boolean isDoesEat() {
        return doesEat;
    }

    public void setDoesEat(boolean doesEat) {
        this.doesEat = doesEat;
    }

    public boolean isHasTwoLeg() {
        return hasTwoLeg;
    }

    public void setHasTwoLeg(boolean hasTwoLeg) {
        this.hasTwoLeg = hasTwoLeg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void hasGorurBebsha(){
        System.out.println("Doing onek lav by gorur bebsha");
    }
}
