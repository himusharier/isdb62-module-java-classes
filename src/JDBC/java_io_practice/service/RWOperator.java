package JDBC.java_io_practice.service;

import JDBC.java_io_practice.model.PurchaseInfo;

import java.util.List;

public interface RWOperator {
    List<PurchaseInfo> read();
    void write(List<PurchaseInfo> purchaseInfoList);
}
