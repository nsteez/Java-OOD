package propertysearch;

/**
 * Exception thrown when a negative number is input for asking price.
 */
public class NegativeNumberException extends RuntimeException {

  /**
   * Constructs a new exception if number is below zero.
   */
  public NegativeNumberException() {
    super("Number cannot be negative.");
  }
}
