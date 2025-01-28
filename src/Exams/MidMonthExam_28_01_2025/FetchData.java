package Exams.MidMonthExam_28_01_2025;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
    public static void main(String[] args) {
        System.out.printf("%-5s %-15s %-15s %-15s %n", "id", "name", "quantity", "brand");
        System.out.println("------------------------------------------------");
        FetchData fetchData = new FetchData();
        fetchData.fetchData();
    }

    public void fetchData() {
        String sql = "SELECT * FROM product";
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                String brand = resultSet.getString("brand");

                System.out.printf("%-5d %-15s %-15d %-15s %n", id, name, quantity, brand);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
