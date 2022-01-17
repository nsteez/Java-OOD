package TodoApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVReader {

  private String[] headingArray;
  private List<String> lines;
  private Todo todo;
  private Integer lineNumber = 0;

  public CSVReader(String filePath) throws IOException {
    readFile(filePath);
    String heading = lines.get(0);
    headingArray = csvSplit(heading);
  }

  protected String[] csvSplit(String csvLine) {
    return csvLine.substring(1, csvLine.length() - 1).split("\",\"");
  }


  protected List<String> readFile(String path) throws IOException {
    lines = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line = "";
      while ((line = reader.readLine()) != null)
        lines.add(line);
    } catch (FileNotFoundException e) {
      throw e;
    } catch (IOException e) {
      throw e;
    }
    return lines;
  }


  public Todo getTodo() {
    if (lineNumber.equals(lines.size() - 1)) {
      return null;
    }
    String todo = lines.get(lineNumber + 1);
    String[] todoArray = csvSplit(todo);

    Map<String, String> tMap = new HashMap<>();
    for (int i = 0; i < headingArray.length; i++) {
      tMap.put(headingArray[i], todoArray[i]);
    }
    lineNumber += 1;

    return new Todo(tMap);
  }
}
