package JDBC.java_io_practice.service.RWOperatorImpl;

import JDBC.java_io_practice.model.PurchaseInfo;
import JDBC.java_io_practice.service.RWOperator;

import java.sql.Connection;
import java.util.List;

public class DBProcessor implements RWOperator {
    private final Connection dbConnection;

    public DBProcessor(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public List<PurchaseInfo> read() {
        return List.of();
    }

    @Override
    public void write(List<PurchaseInfo> purchaseInfoList) {

    }
}
