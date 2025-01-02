package PracticeProjects.AtmBooth;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountLog {
    public Double amount;
    public String type;
    public String time;

    public AccountLog(Double amount, String type) {
        this.amount = amount;
        this.type = type;
        this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a"));
    }

    @Override
    public String toString() {
        return "{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                '}'+ "\n";
    }
}
