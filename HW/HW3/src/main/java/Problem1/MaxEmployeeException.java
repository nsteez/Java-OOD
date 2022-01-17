package Problem1;

public class MaxEmployeeException extends Exception{

  /**
   * Constructs a new exception if max employees have been reached.
   */
    public MaxEmployeeException(){ super("Max Number of Employees for Electrical Services is 4");

    }
  }
