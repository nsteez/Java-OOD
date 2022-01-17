package todoApplication.controller;

import java.io.IOException;

/**
 * Interface for the TodoApplication.
 */
public interface ITodoApplication {

  /**
   * Create a new Todo with user input and add update the CSV file accordingly.
   */
  void addANewTodo() throws IOException;

  /**
   * Set the completed status of a user determined Todo to true and update the CSV file.
   */
  void completeAnExistingTodo() throws IOException;

  /**
   * Display a list of Todos.
   */
  void displayTodos();

}
