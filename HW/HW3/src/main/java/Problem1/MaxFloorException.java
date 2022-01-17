package Problem1;

public class MaxFloorException extends Exception{

  /**
   * Constructs a new Exception if Max employees are reached
   */
  public MaxFloorException(){ super("Max floors for Window Cleaning Service is 3");

  }

}
