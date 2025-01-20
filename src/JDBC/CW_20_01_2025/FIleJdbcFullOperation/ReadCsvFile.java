package JDBC.CW_20_01_2025.FIleJdbcFullOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCsvFile {
    public void String[][] readCsvFile() throws FileNotFoundException {
        String databaseFile = "src\\JDBC\\CW_20_01_2025\\FIleJdbcFullOperation\\products.csv";
        Scanner readingFile = new Scanner(new File(databaseFile));

        /*List<String[]> productList = new ArrayList<>();

        while (readingFile.hasNext()) {
            String singleProduct = readingFile.nextLine();
            String[] productInfo = singleProduct.split(",");

            List<String> productDetails = new ArrayList<>();
            for (String product : productInfo) {
                productDetails.add(product);
            }
            productList.add(productDetails);
        }
        readingFile.close();

        String[][] dataArray = new String[productList.size()][];*/

        // Temporary list to count lines
        int lineCount = 0;
        while (readingFile.hasNext()) {
            lineCount++;
            readingFile.nextLine();
        }

        // Create the 2D array with lineCount rows
        String[][] productList = new String[lineCount][];

        // Reset scanner to read the file again
        readingFile = new Scanner(new File(databaseFile));
        int index = 0;

        while (readingFile.hasNext()) {
            String singleProduct = readingFile.nextLine();
            productList[index] = singleProduct.split(",");
            index++;
        }
        readingFile.close();

        //System.out.println(java.util.Arrays.toString(productList));
        return productList;

    }
}
