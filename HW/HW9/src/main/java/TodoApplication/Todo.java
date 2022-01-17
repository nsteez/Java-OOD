package TodoApplication;

import java.util.Map;

public class Todo {
  private Integer ID;
  private String text;
  private Boolean isCompleted;
  private Integer priority;
  private String category;
  private String dueDate;

  public Todo(Map<String, String> todo ){
    this.ID = Integer.parseInt(todo.get("id"));
    this.text = todo.get("text");
    this.isCompleted = Boolean.parseBoolean(todo.get("completed"));
    this.dueDate = todo.get("due");
    this.priority = Integer.parseInt(todo.get("priority"));
    this.category = todo.get("category");

  }

  public void setCompleted(Boolean completed) {
    isCompleted = completed;
  }

  public Integer getID() {
    return this.ID;
  }

  public String getText() {
    return this.text;
  }

  public Boolean getCompleted() {
    return this.isCompleted;
  }

  public Integer getPriority() {
    return this.priority;
  }

  public String getCategory() {
    return this.category;
  }

  public String getDueDate() {
    return this.dueDate;
  }

  @Override
  public String toString() {
    return "Todo{" +
        "text='" + text + '\'' +
        ", isCompleted=" + isCompleted +
        ", priority=" + priority +
        ", category='" + category + '\'' +
        '}';
  }
}
