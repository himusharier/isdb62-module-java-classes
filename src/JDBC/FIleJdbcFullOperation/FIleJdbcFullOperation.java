package JDBC.FIleJdbcFullOperation;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class FIleJdbcFullOperation {
    public static void main(String[] args) throws FileNotFoundException {
        //crating objects:
        ReadCsvFile readCsvFile = new ReadCsvFile();
        InsertIntoDatabase insertIntoDatabase = new InsertIntoDatabase();
        ReadDataFromDatabase readDataFromDatabase = new ReadDataFromDatabase();
        ChangeNameInDataFromDatabase changeNameInDataFromDatabase = new ChangeNameInDataFromDatabase();
        WritingNewFileWithUpdatedData writingNewFileWithUpdatedData = new WritingNewFileWithUpdatedData();
        System.out.println();

        //read csv file:
        System.out.println(">> 1. Reading data from CSV file...");
        System.out.println(Arrays.deepToString(readCsvFile.readCsvFile()));
        System.out.println();

        //insert data into database:
        System.out.println(">> 2. Inserting data into database...");
        insertIntoDatabase.insertIntoDatabase(readCsvFile.readCsvFile());
        System.out.println();

        //read data from database:
        System.out.println(">> 3. Reading data from database...");
        readDataFromDatabase.readDataFromDatabase();
        readDataFromDatabase.readDataFromDatabasePrint();
        System.out.println();

        //change name:
        System.out.println(">> 4. Changing name from database data...");
        changeNameInDataFromDatabase.changeNameInDataFromDatabase();
        changeNameInDataFromDatabase.changeNameInDataFromDatabasePrint();
        System.out.println();

        //write new file with updated data:
        System.out.println(">> 5. Writing a new file with updated data...");
        writingNewFileWithUpdatedData.writingNewFileWithUpdatedData();
        System.out.println();

    }
}
