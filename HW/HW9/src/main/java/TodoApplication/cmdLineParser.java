package TodoApplication;

import java.util.ArrayList;
import java.util.List;

public class cmdLineParser {
  public static final String CSV_PATH = "--csv-file"; // This is required
  public static final String ADD_TODO = "--add-todo"; //If provided must also include  --todoo-text
  public static final String TODO_TEXT = "--todo-text"; //description of todoo
  public static final String COMPLETED = "--completed"; //optional
  public static final String DUE = "--due"; //optional
  public static final String PRIORITY = "--priority"; // optional 1,2, or 3
  public static final String CATEGORY = "--category";
  public static final String COMPLETED_TODO = "--complete-todo"; // takes a ID of todoo, marks as complete
  public static final String DISPLAY = "--display"; // If none of the following optional arguments  are provided, display all todoos
  public static final String SHOW_INCOMPLETE = "--show-incomplete";// only show incomplete
  public static final String SHOW_CATEGORY = "--show-category"; // only todoos with given category
  public static final String SORT_DATE= "--sort-by-date"; //sort by date , cannot combine with sortByPriority
  public static final String SORT_PRIORITY = "--sort-by-priority"; // sort by priority , cannot combine with sortByDate



  public cmdLineParser(String[] cmds){
    List parseArguments = new ArrayList<>();

    this.parseCommandLine();
  }

  protected void parseCommandLine() {

  }

}
