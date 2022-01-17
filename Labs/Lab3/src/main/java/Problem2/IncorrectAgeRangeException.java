package Problem2;

public class IncorrectAgeRangeException extends Exception{
  public IncorrectAgeRangeException() {
    super("Age range is between 0 and 128");
  }

}
