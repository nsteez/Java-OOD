package propertysearch;

/**
 * Exception thrown when a rate is out of acceptable range.
 */
public class RateRangeException extends RuntimeException {

  /**
   * Constructs a new runtime exception with the specified detail message. The cause is not
   * initialized, and may subsequently be initialized by a call to {@link #initCause}.
   *
   * @param message the detail message. The detail message is saved for later retrieval by the
   *                {@link #getMessage()} method.
   */
  public RateRangeException(String message) {
    super(message);
  }
}
