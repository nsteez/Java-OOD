package Problem1;

public class InvalidIndexException extends Exception{

  /**
   * Constructs a new exception if the index does not exist.
   */

  public InvalidIndexException(){
    super("Index is invalid");
  }


}
