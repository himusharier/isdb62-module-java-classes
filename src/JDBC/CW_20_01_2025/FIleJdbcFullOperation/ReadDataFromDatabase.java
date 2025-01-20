package JDBC.CW_20_01_2025.FIleJdbcFullOperation;

import JDBC.CW_20_01_2025.Oracle;

import java.sql.*;

public class ReadDataFromDatabase extends Oracle {
    public void readDataFromDatabase() {
        String selectQuery = "SELECT * FROM himu_jdbc_practice";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String buyer = resultSet.getString("buyer");
                String seller = resultSet.getString("seller");
                int price = resultSet.getInt("price");
                String buy_date = resultSet.getString("buy_date");
                String sell_date = resultSet.getString("sell_date");

                System.out.println("ID: " + id + ", Name: " + name + ", buyer: " + buyer + ", seller: " + seller + ", price: " + price + ", buy date: " + buy_date + ", sell date: " + sell_date);
            }
        } catch (SQLException e) {
            System.err.println("Error selecting data: " + e.getMessage());
        }
    }
}
