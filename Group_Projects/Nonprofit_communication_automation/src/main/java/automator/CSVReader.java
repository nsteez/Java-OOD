package automator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The CSVReader that reads the CSV file
 */
public class CSVReader {
  private String[] headingArray;
  private List<String> lines;
  private Integer lineNumber = 0;

  /**
   * Constructor for the CSVReader.
   * @param filePath - the cmd line argument
   * @throws IOException - if other I/O exceptions occur
   */
  public CSVReader(String filePath)throws IOException {
    readFile(filePath);
    String heading = lines.get(0);
    headingArray = csvSplit(heading);
  }

  /**
   * Splits the csvLine into readable data.
   * @param csvLine a line from the csv file
   * @return a string array of fields
   */
  protected String[] csvSplit(String csvLine) {
    return csvLine.substring(1, csvLine.length() - 1).split("\",\"");
  }

  /**
   * File reader for CSV
   * @param path - path to the CSV file.
   * @throws IOException - if other I/O exceptions occur
   */
  protected void readFile(String path) throws IOException {
    lines = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line = "";
      while ((line = reader.readLine()) != null)
        lines.add(line);
    } catch (FileNotFoundException e) {
      throw new FileNotFoundException("Error: File not found: " + path);
    } catch (IOException e) {
      throw new IOException("Error: Unable to read: " + path);
    }
  }

  /**
   * Creates a Supporter from the CSV line
   * @return - new Supporter
   */
  public Supporter getSupporter() {
    if(lineNumber.equals(lines.size() - 1)){
      return null;
    }

    String supporter = lines.get(lineNumber + 1);
    String[] supporterArray = csvSplit(supporter);

    Map<String, String> sMap = new HashMap<>();
    for (int i = 0; i < headingArray.length; i++) {
      sMap.put(headingArray[i], supporterArray[i]);

    }
    lineNumber +=1;

    return new Supporter(sMap);
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
    CSVReader csvReader = (CSVReader) o;
    return Arrays.equals(headingArray, csvReader.headingArray) && Objects
        .equals(lines, csvReader.lines) && Objects.equals(lineNumber, csvReader.lineNumber);
  }

  /**
    * @return A unique hashcode pertaining to this CSVReader.
   */
  @Override
  public int hashCode() {
    int result = Objects.hash(lines, lineNumber);
    result = 31 * result + Arrays.hashCode(headingArray);
    return result;
  }

  /**
   * @return A string concatenation of the CSVReader.
   */
  @Override
  public String toString() {
    return "CSVReader{" +
        "headingArray=" + Arrays.toString(headingArray) +
        ", lines=" + lines +
        ", lineNumber=" + lineNumber +
        '}';
  }
}