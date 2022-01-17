package NonprofitCommunicationAutomation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractReader  {
  protected List<String> lines;

  public AbstractReader(String filepath) throws FileNotFoundException, IOException{
    this.readFile(filepath);
  }

  protected List<String> readFile(String path) throws FileNotFoundException, IOException {
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

}
