package JDBC.FIleJdbcFullOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCsvFile {
    public String[][] readCsvFile() throws FileNotFoundException {
        String databaseFile = "src\\JDBC\\FIleJdbcFullOperation\\products-data.csv";
        Scanner readingFile = new Scanner(new File(databaseFile));

        int rowCount = 0;
        int columnCount = 0;
        readingFile.nextLine(); // for skipping header.
        while (readingFile.hasNext()) {
            rowCount++;
            String singleProduct = readingFile.nextLine();
            String[] productInfo = singleProduct.split(",");
            columnCount = productInfo.length;
        }
        String[][] productLists = new String[rowCount][columnCount];

        readingFile.close();
        readingFile = new Scanner(new File(databaseFile));

        int currentRow = 0;
        readingFile.nextLine(); // for skipping header.
        while (readingFile.hasNext()) {
            String singleProduct = readingFile.nextLine();
            String[] productInfo = singleProduct.split(",");
            for (int j = 0; j < productInfo.length; j++) {
                productLists[currentRow][j] = productInfo[j];
            }
            currentRow++;
        }
        readingFile.close();

        return productLists;
    }
}
