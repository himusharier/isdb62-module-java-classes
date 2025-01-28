package Exams.MidMonthExam_28_01_2025;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        int id;
        id = 3;

        DeleteData deleteData = new DeleteData();
        deleteData.updateData(id);

        System.out.printf("%-5s %-15s %-15s %-15s %n", "id", "name", "quantity", "brand");
        System.out.println("------------------------------------------------");
        FetchData fetchData = new FetchData();
        fetchData.fetchData();

    }

    public void updateData(int id) {
        String sql = "DELETE FROM product WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("data deleted!\n");
            } else {
                System.out.println("no data deleted!\n");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
