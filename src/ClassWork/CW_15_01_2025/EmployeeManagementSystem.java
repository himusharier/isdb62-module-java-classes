package ClassWork.CW_15_01_2025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) throws FileNotFoundException {
        /*Employee fullTimeEmployee = new FullTimeEmployee("Alice", 101, 60000);
        Employee partTimeEmployee = new PartTimeEmployee("Alice", 101, 60000);
        Employee conTimeEmployee = new ContractEmployee("Alice", 101, 60000);
        System.out.println(fullTimeEmployee);
        System.out.println(partTimeEmployee);
        System.out.println(conTimeEmployee);*/

        // reading employee data:
        String employeeDataFile = "src\\ClassWork\\CW_15_01_2025\\employee-data.csv";
        String employeePayrollFile = "src\\ClassWork\\CW_15_01_2025\\employee-payroll.csv";
        Scanner readingFile = new Scanner(new File(employeeDataFile));

        StringBuilder updateEmployeeData = new StringBuilder();

        while (readingFile.hasNext()) {
            String singleEmployee = readingFile.nextLine(); // getting a single employee.
            String[] employeeInfo = singleEmployee.split(","); // splitting each element and make an array.

            switch (employeeInfo[3]) {
                case "FullTime":
                    Employee fullTimeEmployee = new FullTimeEmployee(employeeInfo[0], Integer.parseInt(employeeInfo[1]), Double.parseDouble(employeeInfo[2]), employeeInfo[3]);
                    updateEmployeeData.append(fullTimeEmployee + "\n"); // adding to the string builder.
                    System.out.println(fullTimeEmployee); // printing the value.
                    break;
                case "PartTime":
                    Employee partTimeEmployee = new PartTimeEmployee(employeeInfo[0], Integer.parseInt(employeeInfo[1]), Double.parseDouble(employeeInfo[2]), employeeInfo[3]);
                    updateEmployeeData.append(partTimeEmployee + "\n");
                    System.out.println(partTimeEmployee);
                    break;
                case "Contract":
                    Employee contractEmployee = new ContractEmployee(employeeInfo[0], Integer.parseInt(employeeInfo[1]), Double.parseDouble(employeeInfo[2]), employeeInfo[3]);
                    updateEmployeeData.append(contractEmployee + "\n");
                    System.out.println(contractEmployee);
                    break;
            }

            /*if (employeeInfo[3].equals("FullTime")) {
                Employee fullTimeEmployee = new FullTimeEmployee(employeeInfo[0], Integer.parseInt(employeeInfo[1]), Double.parseDouble(employeeInfo[2]), employeeInfo[3]);
                updateEmployeeData.append(fullTimeEmployee);
                System.out.println(fullTimeEmployee);
            }
            if (employeeInfo[3].equals("PartTime")) {
                Employee partTimeEmployee = new PartTimeEmployee(employeeInfo[0], Integer.parseInt(employeeInfo[1]), Double.parseDouble(employeeInfo[2]), employeeInfo[3]);
                updateEmployeeData.append(partTimeEmployee);
                System.out.println(partTimeEmployee);
            }
            if (employeeInfo[3].equals("Contract")) {
                Employee contractEmployee = new ContractEmployee(employeeInfo[0], Integer.parseInt(employeeInfo[1]), Double.parseDouble(employeeInfo[2]), employeeInfo[3]);
                updateEmployeeData.append(contractEmployee);
                System.out.println(contractEmployee);
            }*/

        }
        readingFile.close();

        // writing into file:
        PrintWriter printWriter = new PrintWriter(employeePayrollFile);
        printWriter.print(updateEmployeeData);
        printWriter.close();


    }
}
