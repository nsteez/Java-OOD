package NonprofitCommunicationAutomation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TemplateReader extends AbstractReader {
  private List<String> lines;

  public TemplateReader(String filePath)throws FileNotFoundException, IOException {
    super(filePath);
  }


  public String templateParser(Supporter supporter) {
    for (Map.Entry<String, String> item : supporter.getProfile().entrySet()){
      String key = item.getKey();
      String value = item.getValue();
      System.out.println("[[" + key + "]]" + " = " + value);
    }
    return supporter.toString();

  }

//  public String matcher(){
//    Pattern re = Pattern.compile("\\[\\[([a-zA-Z-]+)\\]\\]");
//
//    System.out.println("Matches " + re.matcher());
//
//  }


}
