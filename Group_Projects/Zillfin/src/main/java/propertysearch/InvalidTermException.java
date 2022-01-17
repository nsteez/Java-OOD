package propertysearch;

/**
 * Throw InvalidTermException if the term is less than 1 month.
 */
public class InvalidTermException extends RuntimeException {

  /**
   * Constructs a new exception if term is less than 1.
   */
  public InvalidTermException() {
    super("The term cannot be less than 1 month.");
  }
}
