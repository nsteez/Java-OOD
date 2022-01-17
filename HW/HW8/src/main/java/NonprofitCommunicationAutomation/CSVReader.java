package NonprofitCommunicationAutomation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CSVReader extends AbstractReader {
  String[] headingArray;

  public CSVReader(String filePath)throws FileNotFoundException, IOException{
    super(filePath);

    String heading = getSupporterString(-1);
    headingArray = heading.substring(1, heading.length() - 1).split("\",\"");
  }

  public String getSupporterString(Integer n) {
    return lines.get(n + 1);
  }

  public Supporter getSupporter(Integer n) {
    String supporter = getSupporterString(n);
    String[] supporterArray = supporter.substring(1, supporter.length() - 1).split("\",\"");

    Map<String, String> sMap = new HashMap<>();
    for (int i = 0; i < headingArray.length; i++) {
      sMap.put(headingArray[i], supporterArray[i]);
    }

    return new Supporter(sMap);

  }
}
