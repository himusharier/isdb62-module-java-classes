package JavaProjects.WithFile.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddNewMemberToTheDatabase {
    public static void addNewMemberToTheDatabase(String name, String type) throws FileNotFoundException {

        // reading members-list database:
        String databaseFile = "src\\JavaProjects\\LibraryManagementSystem\\database\\members-list.csv";
        Scanner readingToWriteFile = new Scanner(new File(databaseFile));
        StringBuilder updatedMember = new StringBuilder();

        int memberId = 1000;
        while (readingToWriteFile.hasNext()) {
            String singleMember = readingToWriteFile.nextLine();
            String[] memberInfo = singleMember.split(",");

            updatedMember.append(singleMember).append("\n");

            memberId = Integer.parseInt(memberInfo[0]);
        }

        // id, name, membership, booklists
        updatedMember.append(++memberId + "," + name + "," + type + "," + "\"" + "\"").append("\n");

        readingToWriteFile.close();

        // writing files:
        PrintWriter printWriter = new PrintWriter(databaseFile);
        printWriter.print(updatedMember);
        printWriter.close();

        System.out.println();
        System.out.println("----- Member Details -----");
        System.out.println("ID " + "\t\t: " + memberId);
        System.out.println("Name " + "\t: " + name);
        System.out.println("Type " + "\t: " + type);

    }
}
