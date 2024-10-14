package lk.ijse.posbackendprase2.exception;

public class OrderDetailNotFoundException extends RuntimeException {
    public OrderDetailNotFoundException(String message) {
        super(message);
    }

    public OrderDetailNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderDetailNotFoundException(Throwable cause) {
        super(cause);
    }
}
