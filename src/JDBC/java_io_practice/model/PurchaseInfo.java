package JDBC.java_io_practice.model;

public class PurchaseInfo {
    private int id;
    private String productName;
    private double price;
    private String buyer;
    private String seller;
    private String buyingDate;
    private String sellingDate;

    public PurchaseInfo() {
    }

    public PurchaseInfo(int id, String productName, double price, String buyer, String seller, String buyingDate, String sellingDate) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.buyer = buyer;
        this.seller = seller;
        this.buyingDate = buyingDate;
        this.sellingDate = sellingDate;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getSeller() {
        return seller;
    }

    public String getBuyingDate() {
        return buyingDate;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }

    public void setBuyingDate(String buyingDate) {
        this.buyingDate = buyingDate;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void printInfo(LineType lineType) {
        String output = switch (lineType) {
            case SINGLE_LINE -> getSingleLineString();
            case MULTIPLE_LINE -> getMultiLineString();
        };
        System.out.println(output);

    }

    public String getSingleLineString(){
        return String.format(
                "ID: %d | Product: %s | Price: %.2f | Buyer: %s | Seller: %s | Buying Date: %s | Selling Date: %s",
                id, productName, price, buyer, seller, buyingDate, sellingDate
        );
    }
    public String getMultiLineString() {
        return String.format(
                "Purchase Information:\n" +
                        "ID: %d\n" +
                        "Product: %s\n" +
                        "Price: %.2f\n" +
                        "Buyer: %s\n" +
                        "Seller: %s\n" +
                        "Buying Date: %s\n" +
                        "Selling Date: %s",
                id, productName, price, buyer, seller, buyingDate, sellingDate
        );
    }
}
