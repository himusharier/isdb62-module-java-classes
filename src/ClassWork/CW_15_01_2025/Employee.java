package ClassWork.CW_15_01_2025;

public abstract class Employee {
    private String name;
    private int ID;
    private double salary;

    // constructor:
    public Employee(String name, int ID, double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Enter a valid salary!");
        }
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    // getters and setters:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Enter a valid salary!");
        }
        this.salary = salary;
    }
}
