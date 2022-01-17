package todoApplication.model;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CLIParser {
  private static final List<Command> COMMANDS = readConfigFile();

  private String pathToCsv;
  // For adding todos
  private Boolean addTodoRequested = false;
  private String todoText;
  private Boolean completed = false;
  private String dueDate;
  private String priority;
  private String category;
  // For completing todos
  private List<String> completeTodos;
  // For displaying todos
  private Boolean displayRequested = false;
  private Boolean showIncomplete = false;
  private String categoryFilter;
  private Boolean sortByDate = false;
  private Boolean sortByPriority = false;

  public CLIParser(String[] args) {
    this.completeTodos = new ArrayList<>();
    Boolean followupExpected = false;
    for (int i = 0, argsLength = args.length; i < argsLength; i++) {
      if (!followupExpected) {
        String arg = args[i];
        Command currentCommand = COMMANDS.stream().filter(command -> command.getName().equals(arg))
            .collect(Collectors.toList()).get(0);
        if (currentCommand != null) {
          followupExpected = currentCommand.needsFollowingArg();
          switch (currentCommand.getName()) {
            case "--csv-file":
              this.pathToCsv = getNextArg(args, i+1);
              break;
            case "--add-todo":
              this.addTodoRequested = true;
              break;
            case "--todo-text":
              this.todoText = getNextArg(args, i+1);
              break;
            case "--completed":
              this.completed = true;
              break;
            case "--due":
              this.dueDate = getNextArg(args, i+1);
              break;
            case "--priority":
              this.priority = getNextArg(args, i+1);
              break;
            case "--category":
              this.category = getNextArg(args, i+1);
              break;
            case "--complete-todo":
              if (i+1 < argsLength) this.completeTodos.add(args[i+1]);
              break;
            case "--display":
              this.displayRequested = true;
              break;
            case "--show-incomplete":
              this.showIncomplete = true;
              break;
            case "--show-category":
              this.categoryFilter = getNextArg(args, i+1);
              break;
            case "--sort-by-date":
              this.sortByDate = true;
              break;
            case "--sort-by-priority":
              this.sortByPriority = true;
              break;
          }
        }
      } else followupExpected = false;
    }
    validateArgs();
  }

  private String getNextArg(String[] args, int pos) {
    return pos < args.length ? args[pos] : null;
  }

  private void validateArgs() {
    if (this.pathToCsv == null)
      throw new IllegalArgumentException("Error: CSV file is required.");
    if (this.addTodoRequested && this.todoText == null)
      throw new IllegalArgumentException("Error: A description must be provided for new todos.");
    if (this.sortByPriority && this.sortByDate)
      throw new IllegalArgumentException("Error: Only one sort option can be used.");
  }

  public String getPathToCsv() {
    return this.pathToCsv;
  }

  public Boolean isAddTodoRequested() {
    return this.addTodoRequested;
  }

  public String getTodoText() {
    return this.todoText;
  }

  public Boolean isCompleted() {
    return this.completed;
  }

  public String getDueDate() {
    return this.dueDate;
  }

  public String getPriority() {
    return this.priority;
  }

  public String getCategory() {
    return this.category;
  }

  public List<String> getCompleteTodos() {
    return this.completeTodos;
  }

  public Boolean isDisplayRequested() {
    return this.displayRequested;
  }

  public Boolean isShowIncomplete() {
    return this.showIncomplete;
  }

  public String getCategoryFilter() {
    return this.categoryFilter;
  }

  public Boolean isSortByDate() {
    return this.sortByDate;
  }

  public Boolean isSortByPriority() {
    return this.sortByPriority;
  }

  private static List<Command> readConfigFile() {
    List<Command> commands = new ArrayList<>();
    commands.add(new Command("--csv-file", true, true));
    commands.add(new Command("--add-todo", false, false, "--todo-text", null));
    commands.add(new Command("--todo-text", false, true));
    commands.add(new Command("--completed", false, false));
    commands.add(new Command("--due", false, true));
    commands.add(new Command("--priority", false, true));
    commands.add(new Command("--category", false, true));
    commands.add(new Command("--complete-todo", false, true));
    commands.add(new Command("--display", false, false));
    commands.add(new Command("--show-incomplete", false, false));
    commands.add(new Command("--show-category", false, true));
    commands.add(new Command("--sort-by-date", false, false, null, "--sort-by-priority"));
    commands.add(new Command("--sort-by-priority", false, false, null, "--sort-by-date"));
    return commands;
  }
}
