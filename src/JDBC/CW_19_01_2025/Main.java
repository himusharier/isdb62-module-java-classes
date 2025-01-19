package JDBC.CW_19_01_2025;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String[][] students = {
                {"John Doe", "20", "john.doe@example.com"},
                {"Jane Smith", "22", "jane.smith@example.com"},
                {"Alice Johnson", "19", "alice.johnson@example.com"},
                {"Bob Brown", "21", "bob.brown@example.com"}
        };

        InsertStudentDataIntoOracle oracle = new InsertStudentDataIntoOracle();
        oracle.insertDummyData(students);

    }
}
