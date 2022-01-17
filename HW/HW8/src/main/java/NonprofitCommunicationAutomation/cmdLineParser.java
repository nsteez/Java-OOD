package NonprofitCommunicationAutomation;

public class cmdLineParser {

  //  public static final String email = "--email";
//  public static final String emailTemplate = "--email-template";
//  public static final String letter = "--letter";
//  public static final String letterTemplate = "--letter-template";
//  public static final String output = "--output-dir";
//  public static final String csvFile = "--csv-file";
  private Boolean isEmail;
  private Boolean isLetter;
  private String emailTemplate = "";
  private String letterTemplate = "";
  private String output = "";
  private String csvFile = "";

  public void processArgs(String[] args) throws IllegalArgumentException {
    for (int i = 0; i < args.length; i += 1) {
      try {
        switch (args[i]) {
          case "--email":
            isEmail = true;
            break;
          case "--letter":
            isLetter = true;
            break;
          case "--letter-template":
            letterTemplate = args[++i];
            break;
          case "--emailTemplate":
            emailTemplate = args[++i];
            break;
          case "--output-dir":
            output = args[++i];
            break;
          case "--csv-file":
            csvFile = args[++i];
            break;
          default:
            throw new IllegalArgumentException("Illegal argument");
        }
      } catch(NumberFormatException e) {
          throw new IllegalArgumentException("");
      }
    }
    if (isEmail == true && emailTemplate.equals("")) {
      throw new IllegalArgumentException("--email given but not --email-template");
    }
      if (isLetter == true && letterTemplate.equals("")) {
        throw new IllegalArgumentException("--letter given but not --letter-template");

    }
  }
}