package JDBC.CW_20_01_2025.FIleJdbcFullOperation;

import java.io.FileNotFoundException;

public class FIleJdbcFullOperation {
    public static void main(String[] args) throws FileNotFoundException {
        ReadCsvFile readCsvFile = new ReadCsvFile();
        InsertIntoDatabase insertIntoDatabase = new InsertIntoDatabase();
        insertIntoDatabase.insertIntoDatabase(readCsvFile.readCsvFile());
        System.out.println("---------------------------------------------");
        ReadDataFromDatabase readDataFromDatabase = new ReadDataFromDatabase();
        readDataFromDatabase.readDataFromDatabase();
        System.out.println("---------------------------------------------");


    }
}
