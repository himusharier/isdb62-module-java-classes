package JDBC.java_io_practice.service.RWOperatorImpl;

import JDBC.java_io_practice.model.PurchaseInfo;
import JDBC.java_io_practice.service.RWOperator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvProcessor implements RWOperator {

    private final String filePath;

    public CsvProcessor(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<PurchaseInfo> read() {
        List<PurchaseInfo> purchaseInfoList = new ArrayList<>();
        try {
            Scanner readingFile = new Scanner(new File(filePath));
            while (readingFile.hasNext()){
                purchaseInfoList.add(getPurchaseInfoObjFromString(readingFile.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error occurred ," + e.getMessage());
        }
        return purchaseInfoList;
    }

    @Override
    public void write(List<PurchaseInfo> purchaseInfoList) {
        //throw new
    }

    private PurchaseInfo getPurchaseInfoObjFromString(String data) {
        List<String> fragments = List.of(data.split(","));

        return new PurchaseInfo(
                Integer.parseInt(fragments.get(0)),
                fragments.get(1),
                Double.parseDouble(fragments.get(4)),
                fragments.get(2),
                fragments.get(3),
                fragments.get(5),
                fragments.get(6));
    }
}
