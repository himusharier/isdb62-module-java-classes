package ClassWork.CW_15_01_2025;

public class PartTimeEmployee extends Employee implements TaxCalculator{
    private String type = "PartTime";
    private double taxRate = 0;

    // constructor:
    public PartTimeEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
    }
    public PartTimeEmployee(String name, int ID, double salary, String type) {
        super(name, ID, salary);
        this.type = type;
    }

    @Override
    public double taxCalculation() {
        return getSalary() * taxRate;
    }

    @Override
    public String toString() {
        return getName() + "," + getID() + "," + getSalary() + "," + type + "," + taxCalculation();
    }
}
