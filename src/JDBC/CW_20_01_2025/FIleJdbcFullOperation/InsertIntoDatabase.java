package JDBC.CW_20_01_2025.FIleJdbcFullOperation;

import java.sql.*;

public class InsertIntoDatabase extends OracleConnection {
    public void insertIntoDatabase(String[][] products) {
        String insertQuery = "INSERT INTO himu_jdbc_practice (name, buyer, seller, price, buy_date, sell_date) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            for (String[] product : products) {
                preparedStatement.setString(1, product[0]); //name
                preparedStatement.setString(2, product[1]); //buyer
                preparedStatement.setString(3, product[2]); //seller
                preparedStatement.setDouble(4, Double.parseDouble(product[3])); //price
                preparedStatement.setDate(5, Date.valueOf(product[4])); //buy date
                preparedStatement.setDate(6, Date.valueOf(product[5])); //sell date

                preparedStatement.addBatch();
            }

            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}
