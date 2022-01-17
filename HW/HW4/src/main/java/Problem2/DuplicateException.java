package Problem2;

public class DuplicateException extends Exception{
  /**
   * Constructs new exception if num already exist in Set
   */
   public DuplicateException(){
     super("No duplicates allowed");

   }
}
