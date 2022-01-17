package problem1;

/**
 * Exception to throw if there attempts to access items in an empty Queue.
 */
public class EmptyQueueException extends Exception{
  public EmptyQueueException(){
    super("Queue is empty!");
  }
}
