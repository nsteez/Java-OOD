package propertysearch;

public class NegativeNumberException extends Exception{

  /**
   * Constructs a new exception if number entered is below zero.
   */
  public NegativeNumberException() {super("Number cannot be below zero");
  }
}
