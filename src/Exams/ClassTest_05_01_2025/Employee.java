package Exams.ClassTest_05_01_2025;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate yearOfJoining;
    private Integer salary;
    private String address;

    public Employee(String name, LocalDate yearOfJoining, Integer salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\t " + yearOfJoining.getYear() + "\t\t\t\t " + address;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahul", LocalDate.of(1994,1,1), null, "Tilak Nagar, New Delhi");
        Employee emp2 = new Employee("Raman", LocalDate.of(2000,1,1), null, "Hari Nagar, New Delhi");
        Employee emp3 = new Employee("Rohit", LocalDate.of(1999,1,1), null, "Subash Nagar, New Delhi");

        System.out.println("Year\t Year of Joining\t Address");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

    }
}
