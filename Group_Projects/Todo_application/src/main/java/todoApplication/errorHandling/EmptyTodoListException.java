package todoApplication.errorHandling;

public class EmptyTodoListException extends RuntimeException {

  public EmptyTodoListException() {
    super("ERROR: The Todo list is empty.");
  }
}