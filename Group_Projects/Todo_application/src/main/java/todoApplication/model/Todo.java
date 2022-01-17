package todoApplication.model;

import java.io.Console;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

/**
 * Class that represents a Todo Object.
 */
public class Todo {
  private String text;
  private Boolean completed;
  private LocalDate due;
  private Integer priority;
  private String category;

  /**
   * Constructor for the Todo obj.
   * @param text - String text of Todo
   * @param completed - Boolean for if Todo is completed
   * @param due - LocalDate for the Todo
   * @param priority - Integer priority for the Todo
   * @param category - String category for the Todo
   */
  public Todo(String text, Boolean completed,LocalDate due, Integer priority, String category){
    this.text = text;
    this.completed = completed;
    this.due = due;
    this.priority = priority;
    this.category = category;

  }

  /**
   * Gets the text
   * @return String text
   */
  public String getText() {
    return text;
  }

  /**
   * Gets completed
   * @return Boolean completed
   */
  public Boolean getCompleted() {
    return completed;
  }

  /**
   * Gets LocalDate due
   * @return LocalDate due
   */
  public LocalDate getDue() {
    return due;
  }

  /**
   * Gets the Integer Priority
   * @return priority
   */
  public Integer getPriority() {
    return priority;
  }

  /**
   * Gets the Category
   * @return category
   */
  public String getCategory() {
    return category;
  }

  /**
   * Sets Boolean completed
   * @param completed
   */
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  /**
   * Compares is the Priority
   */
  public static class ComparePriority implements Comparator<Todo>{
    @Override
    public int compare(Todo one, Todo two) {
      if(one.getPriority() == null){
        return 1;
      } if (two.getPriority() == null){
        return -1;
      }
      return one.getPriority().compareTo(two.getPriority());
    }
  }

  /**
   * Compares the Date
   */
  public static class CompareDate implements Comparator<Todo>{
    @Override
    public int compare(Todo one, Todo two) {
      if(one.getDue() == null){
        return 1;
      } if (two.getDue() == null){
        return -1;
      }
      return one.getDue().compareTo(two.getDue());
    }
  }

  /**
   * @param o An object for comparison.
   * @return True if equal, False if not equal.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Todo todo = (Todo) o;
    return Objects.equals(text, todo.text) && Objects
        .equals(completed, todo.completed) && Objects.equals(due, todo.due)
        && Objects.equals(priority, todo.priority) && Objects
        .equals(category, todo.category);
  }

  /**
   * @return A unique hashCode pertaining to this Todo.
   */
  @Override
  public int hashCode() {
    return Objects.hash(text, completed, due, priority, category);
  }

//  /**
//   * @return A unique string concatenation of the Todo.
//   */
//  @Override
//  public String toString() {
//    return  text + "  "
//        + completed + "  "
//        + due + "  "
//        + priority + "  "
//        + category;
//  }
//  @Override
//  public String toString(){
//    return text + "      |" +
//        completed + " |" +
//        due + " |" + "   " +
//        priority + "|" + "  " +
//        category;
//  }
//  @Override
//  public String toString(){
//    Console col = System.console();
//    if (col != null) {
//      String fmt = "%1$4s %2$10s %3$10s%n";
//      return col.format(fmt, text) +
//          col.format(fmt, completed)+
//          col.format(fmt, due) +
//          col.format(fmt, priority) +
//          col.format(fmt, category);
//    }
//      return "blank";
//  }
//
  @Override
  public String toString(){
    return String.format("%-15s | %-8s | %-5s | %-5s | %-5s", text,completed, due, priority, category);
  }

}
