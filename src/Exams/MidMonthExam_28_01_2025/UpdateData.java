package Exams.MidMonthExam_28_01_2025;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        int id, quantity;
        id = 3;
        quantity = 8;

        UpdateData updateData = new UpdateData();
        updateData.updateData(id, quantity);

        System.out.printf("%-5s %-15s %-15s %-15s %n", "id", "name", "quantity", "brand");
        System.out.println("------------------------------------------------");
        FetchData fetchData = new FetchData();
        fetchData.fetchData();

    }

    public void updateData(int id, int quantity) {
        String sql = "UPDATE product SET quantity = ? WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, quantity);
            statement.setInt(2, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("data updated!\n");
            } else {
                System.out.println("no data updated!\n");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
