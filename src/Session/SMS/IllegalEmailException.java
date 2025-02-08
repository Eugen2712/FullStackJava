package Session.SMS;

/**
 * Exception thrown when an illegal email value is encountered.
 */
public class IllegalEmailException extends RuntimeException {
    /**
     * Constructs a new IllegalEmailException with the specified detail message.
     *
     * @param message the detail message
     */
    public IllegalEmailException(String message) {
        super(message);
    }
}
