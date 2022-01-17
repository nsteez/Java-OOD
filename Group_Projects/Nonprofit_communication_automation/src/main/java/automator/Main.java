package automator;

/**
 * Main class to contain the main method of our Non-profit Communication Automation program
 */
public class Main {
  private static final String USAGE = "\n\n"
      + "Usage:\n"
      + "--email Generate email messages. If this option is provided, then\n"
      + "--email-template must also be provided.\n"
      + "--email-template <path/to/file> A filename for the email template.\n"
      + "--letter Generate letters. If this option is provided, then\n"
      + "--letter-template must also be provided.\n"
      + "--letter-template <path/to/file> A filename for the letter\n"
      + "template.\n"
      + "--output-dir <path/to/folder> The folder to store all generated\n"
      + "files. This option is required.\n"
      + "--csv-file <path/to/folder> The CSV file to process. This option is\n"
      + "required.\n\n"
      + "Examples:\n"
      + "--email --email-template email-template.txt --output-dir emails\n"
      + "--csv-file customer.csv\n\n"
      + "--letter --letter-template letter-template.txt --output-dir letters\n"
      + "--csv-file customer.csv";

  /**
   * Entry point of execution for the Non-profit Communication Automation program
   *
   * @param args the arguments for the execution of the program - see Usage Documentation
   */
  public static void main(String[] args) {
    try {
      // Create a new command line parser object with the args from main
      CommandLineParser commandParser = new CommandLineParser(args);
      // Create a new CSV reader with the csv file path obtained from the command parser
      CSVReader csvReader = new CSVReader(commandParser.getCsvFile());
      // Declare generators for each form of communication
      //    NOTE: The reason we declare here without initializing is because we cannot
      //          do the declaration inside the body of the if statement below
      CommunicationGenerator emailGenerator = null;
      CommunicationGenerator letterGenerator = null;
      // Initialize generators with the appropriate template and output directory
      // obtained from the command parser if they have been requested by the user
      if (commandParser.getGenerateEmail())
        emailGenerator = new CommunicationGenerator
            (commandParser.getEmailTemplate(), commandParser.getOutputDirectory());
      if (commandParser.getGenerateLetter())
        letterGenerator = new CommunicationGenerator
            (commandParser.getLetterTemplate(), commandParser.getOutputDirectory());
      // Counter and extension used for naming the generated files
      int counter = 0;
      String extension;
      // Use method from csv reader to get the next supporter object
      Supporter supporter;
      while ((supporter = csvReader.getSupporter()) != null) {
        extension = String.format("%03d", counter) + ".txt";
        // Generate the requested form of communication for each supporter using
        // generator's generate method
        if (emailGenerator != null)
          emailGenerator.generate(supporter, "email" + extension);
        if (letterGenerator != null)
          letterGenerator.generate(supporter, "letter" + extension);
        counter++;
      }
      // Catch any exception that might have been thrown by our classes and display
      // its message followed by the usage text
    } catch (Exception e) {
      System.err.println(e.getMessage() + USAGE);
    }
  }
}
