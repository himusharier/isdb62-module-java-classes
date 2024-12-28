package JavaProjects.SchoolManagementSystemModified;

import java.io.IOException;
import java.util.Scanner;

public class SchoolManagementSystem {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        //registering schools:
        School[] schools = {
                new School("Jashore Zilla School", null, null),
                new School("Polytechnic Primary School", null, null),
                new School("Jashore Govt. City College", null, null)
        };

        for (int i = 0; i < 5; ++i) System.out.println();

        while (true) {
            System.out.print("""
                    --------------------------------------------
                        Welcome to School Management System
                    --------------------------------------------
                    >>> School List <<<
                    """);
            for (int i = 0; i < schools.length; i++) {
                System.out.println((i+1) + ") " + schools[i]);
            }
            System.out.println("--------------------------------");
            System.out.print("# Choose school: ");
            int enterSchool = input.nextInt() - 1;

            for (int i = 0; i < 5; ++i) System.out.println();

            if (enterSchool < 0 || enterSchool >= schools.length) {
                System.out.println(">> ERROR: Invalid choice.");
                continue;
            } else {
                System.out.printf("""
                    ---------------------------------------------------------------------------
                        Welcome to "%s" Management System
                    ---------------------------------------------------------------------------
                    >>> Options: <<<
                    1) Add Teacher
                    2) Add Student
                    3) See Teacher List
                    4) See Student List
                    5) Add Funds
                    6) Add Expanses
                    7) See Funding History
                    8) See Expanses History
                    -----------------------------------------
                    """, schools[enterSchool].toString());
                System.out.print("# Enter Option: ");
                int enterOption = input.nextInt();

                switch (enterOption) {
                    case 1:
                        System.out.print("Enter teacher Details (id, name, salary): ");
                        int tId = input.nextInt();
                        String tName = input.next();
                        int tSalary = input.nextInt();
                        break;
                }
            }

        }
    }

}
