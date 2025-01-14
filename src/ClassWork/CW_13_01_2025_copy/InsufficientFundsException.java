package ClassWork.CW_13_01_2025_copy;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super("Insufficient balance!");
    }
}
