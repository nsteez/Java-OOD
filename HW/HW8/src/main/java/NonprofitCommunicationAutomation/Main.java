package NonprofitCommunicationAutomation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {

    try {
      cmdLineParser parser = new cmdLineParser();
      parser.processArgs(args);
      } catch (IllegalArgumentException e) {
      System.out.println("ERROR: " + e.getMessage());
    }



    //CSVReader processor = new CSVReader(args[0]);
    //System.out.println(processor.getSupporterString(1));
    //Supporter supporter = processor.getSupporter(1);
    //System.out.println(supporter.toString());
//    TemplateReader template = new TemplateReader(args[1]);
//    System.out.println(template.templateParser(supporter).toString());
  }

}
