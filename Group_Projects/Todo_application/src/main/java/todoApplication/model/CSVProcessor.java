package todoApplication.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CSVProcessor {
  private final String pathToCsv;
  private final String[] headers;
  private final List<String> lines;
  private int lineCounter;

  public CSVProcessor(String pathToCsv) throws IOException {
    this.pathToCsv = pathToCsv;
    this.lineCounter = 1;
    this.lines = new ArrayList<>();
    readFile();
    this.headers = splitLine(lines.get(0));
  }

  private String[] splitLine(String line) {
    return line.trim().substring(1, line.length() - 1).split("\",\"");
  }

  private void readFile() throws IOException {
    try {
      BufferedReader reader = new BufferedReader(new FileReader(this.pathToCsv));
      String line;
      while ((line = reader.readLine()) != null)
        lines.add(line);
      reader.close();
    } catch (IOException e) {
      throw new IOException("Error: Unable to read " + this.pathToCsv);
    }
  }

  public Map<String, String> getNextTodo() {
    if (lineCounter < lines.size()) {
      String[] todoData = splitLine(lines.get(lineCounter));
      Map<String, String> todo = new HashMap<>();
      for (int i = 0; i < todoData.length; i++)
        todo.put(headers[i], todoData[i]);
      this.lineCounter++;
      return todo;
    } else return null;
  }

  public void writeLine(Map<String, String> csvEntry) throws IOException {
    String line = buildLine(csvEntry);
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(this.pathToCsv, true));
      writer.write(line + '\n');
      writer.close();
    } catch (IOException e) {
      throw new IOException("Error: Unable to write to " + this.pathToCsv);
    }
  }

  private String buildLine(Map<String, String> csvEntry) {
    StringBuilder result = new StringBuilder();
    for (String key : headers)
      result.append('"').append(csvEntry.get(key) != null ? csvEntry.get(key) : "?").append("\",");
    return result.substring(0, result.length() - 1);
  }

  public int getLineCount() {
    return this.lineCounter;
  }

  public void updateCompletedTodo(String id) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(this.pathToCsv));
    StringBuilder buffer = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
      Pattern idPattern = Pattern.compile("^\"" + id + "\".+");
      Pattern completedPattern = Pattern.compile("(^\".+?\",\".+?\",\")false\"");
      if (idPattern.matcher(line).matches())
        line = completedPattern.matcher(line).replaceFirst("$1true\"");
      buffer.append(line).append('\n');
    }
    reader.close();
    BufferedWriter writer = new BufferedWriter(new FileWriter(this.pathToCsv));
    writer.write(buffer.toString());
    writer.close();
  }
}
