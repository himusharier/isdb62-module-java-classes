package Exams.MidMonthExam_28_01_2025;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private String brand;

    public Product(int id, String name, int quantity, String brand) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
