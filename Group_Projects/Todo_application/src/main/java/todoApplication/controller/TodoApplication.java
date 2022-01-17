package todoApplication.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import todoApplication.errorHandling.EmptyTodoListException;
import todoApplication.model.CLIParser;
import todoApplication.model.CSVProcessor;
import todoApplication.model.Todo;
import todoApplication.view.DisplayTodos;

import java.util.HashMap;

/**
 * Class TodoApplication is the controller for the TodoApplication system.
 */
public class TodoApplication implements ITodoApplication {

  private HashMap<Integer, Todo> todoHashMap;
  private CLIParser cliParser;
  private CSVProcessor csvProcessor;

  /**
   * Construct a new TodoApplication.
   */
  public TodoApplication(String[] commandLineInput) throws IOException {
    this.cliParser = new CLIParser(commandLineInput);
    this.csvProcessor = new CSVProcessor(cliParser.getPathToCsv());
    this.todoHashMap = new HashMap<Integer, Todo>();
    this.actionItems();
  }

  /**
   * Perform actionItems resulting from command line input.
   *
   * @throws IOException
   */
  private void actionItems() throws IOException {
    populateExistingTodos();
    if (this.cliParser.isAddTodoRequested()) {
      this.addANewTodo();
    }
    if (!this.cliParser.getCompleteTodos().isEmpty()) {
      this.completeAnExistingTodo();
    }
    if (this.cliParser.isDisplayRequested()) {
      this.displayTodos();
    }
  }

  /**
   * Populate existing todos based on command line input.
   */
  private void populateExistingTodos() {
    Map<String, String> unformattedMap;
    Todo newTodo;
    Integer key;
    unformattedMap = this.csvProcessor.getNextTodo();
    while (unformattedMap != null) {
      key = Integer.parseInt(unformattedMap.get("id"));
      newTodo = formatTodo(unformattedMap);
      this.todoHashMap.put(key, newTodo);
      unformattedMap = this.csvProcessor.getNextTodo();

    }
  }

  /**
   * Generate a new Todo from a Map of string key-value pairs.
   *
   * @param unformattedTodo A Map of strings pertaining to a new Todo.
   * @return A new Todo.
   */
  private Todo formatTodo(Map<String, String> unformattedTodo) {
    DateTimeFormatter formatter = DateTimeFormatter
        .ofPattern("[MM/dd/yyyy][M/dd/yyyy][MM/d/yyyy][M/d/yyyy]");
    String text = unformattedTodo.get("text");
    Boolean completed = Boolean.parseBoolean(unformattedTodo.get("completed"));
    String dueString = unformattedTodo.get("due");
    LocalDate due;
    if (dueString == null || !dueString.equals("?")) {
      due = LocalDate.parse(dueString, formatter);
    } else {
      due = null;
    }
    String priorityString = unformattedTodo.getOrDefault("priority", "?");
    Integer priority;
    if (priorityString == null || priorityString.equals("?")) {
      priority = null;
    } else {
      priority = Integer.parseInt(priorityString);
    }
    String category = unformattedTodo.get("category");
    if (category == null || category.equals("?")) {
      category = null;
    }
    Todo formattedTodo = new Todo(text, completed, due, priority, category);
    return formattedTodo;
  }

  /**
   * Add a new Todo to the TodoApplication.
   */
  @Override
  public void addANewTodo() throws IOException {
    Integer newID = csvProcessor.getLineCount();
    String newIDString = newID.toString();
    HashMap<String, String> unformattedTodo = new HashMap<>();
    unformattedTodo.put("id", newIDString);
    unformattedTodo.put("text", cliParser.getTodoText());
    unformattedTodo.put("completed", cliParser.isCompleted().toString());
    unformattedTodo.put("due", cliParser.getDueDate());
    unformattedTodo.put("priority", cliParser.getPriority());
    unformattedTodo.put("category", cliParser.getCategory());
    Todo newTodo = formatTodo(unformattedTodo);
    this.todoHashMap.put(newID, newTodo);
    this.csvProcessor.writeLine(unformattedTodo);
  }

  /**
   * Set the completed status of a user determined Todo to true and update the CSV file.
   */
  @Override
  public void completeAnExistingTodo() throws IOException {
    for (int i = 0; i < this.cliParser.getCompleteTodos().size(); i++) {
      Integer key = Integer.parseInt(this.cliParser.getCompleteTodos().get(i));
      this.todoHashMap.get(key).setCompleted(true);
      this.csvProcessor.updateCompletedTodo(this.cliParser.getCompleteTodos().get(i));
    }
  }

  /**
   * Display a list of Todos.
   */
  @Override
  public void displayTodos() throws EmptyTodoListException {
//    if (this.cliParser.isShowIncomplete()) {
//      DisplayTodos.displayIncompleteTodos(this.todoHashMap);
//    }
//    if (this.cliParser.getFilterByCategory()) {
//      System.out.println("Filter by category working \n");
//      System.out.println("printing category: " + this.cliParser.getCategoryFilter()+"\n");
//      DisplayTodos.displayTodosFilterByCategory(this.todoHashMap, this.cliParser.getCategoryFilter());
//    }
//    if (this.cliParser.isSortByDate()) {
//      DisplayTodos.displayTodosSortByDateAscending(this.todoHashMap);
//    }
//    if (this.cliParser.isSortByPriority()) {
//      DisplayTodos.displayTodosSortByPriorityAscending(this.todoHashMap);
//    }
//    else {
//      DisplayTodos.displayAllTodos(this.todoHashMap);
//    }
 }

  /**
   * Get the HashMap for this TodoApplication.
   *
   * @return The current todoHashMap.
   */
  public HashMap<Integer, Todo> getTodoHashMap() {
    return this.todoHashMap;
  }
}
