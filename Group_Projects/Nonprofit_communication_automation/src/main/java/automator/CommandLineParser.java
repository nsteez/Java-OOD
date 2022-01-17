package automator;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Class CommandLineParser determines the behavior of the Automator based on command line
 * arguments.
 */
public class CommandLineParser {

  private static final String DIRECTORY_COMMAND = "--output-dir";
  private static final String CSV_COMMAND = "--csv-file";
  private static final String CSV_EXTENSION = ".csv";
  private static final String EMAIL_COMMAND = "--email";
  private static final String EMAIL_TEMPLATE_COMMAND = "--email-template";
  private static final String LETTER_COMMAND = "--letter";
  private static final String LETTER_TEMPLATE_COMMAND = "--letter-template";
  private static final String TEXT_EXTENSION = ".txt";
  private Boolean generateEmail = false;
  private Boolean generateLetter = false;
  private String outputDirectory;
  private String csvFile;
  private String emailTemplate = null;
  private String letterTemplate = null;

  /**
   * Construct a CommandLineParser and parse the string array from the command line.
   *
   * @param array A string array generated from the command line.
   * @throws IOException if the provided arguments do no comply with the program's design
   */
  public CommandLineParser(String[] array) throws IOException {
    // Clone command line argument array into List interface to utilize list methods.
    List<String> list = Arrays.asList(array.clone());
    // Call the parseCommandLine method to parse command line using newly initialized list.
    this.parseCommandLine(list);
  }

  /**
   * Method to parse and authenticate command line arguments, as well as determine if an email,
   * letter, or both will be generated.
   *
   * @param list the provided command line arguments in list form
   * @throws IOException if the provided arguments do no comply with the program's design
   */
  protected void parseCommandLine(List<String> list) throws IOException {
    // Declare local variables "argumentValidationBuffer" and "file" for use in parseCommandLine
    // method.
    String argumentValidationBuffer;
    File file;
    // Validate directory arguments from command line input.
    if (!list.contains(DIRECTORY_COMMAND)) {
      throw new IOException("Error: --output-dir is required.");
    } else {
      argumentValidationBuffer = list.get(list.indexOf(DIRECTORY_COMMAND) + 1);
      file = new File(argumentValidationBuffer);
      if (!file.isDirectory()) {
        throw new IOException("Error: The directory argument is not a valid directory.");
      }
      this.outputDirectory = argumentValidationBuffer;
    }
    // Validate CSV file arguments from command line input.
    if (!list.contains(CSV_COMMAND)) {
      throw new IOException("Error: --csv-file is required.");
    } else {
      argumentValidationBuffer = list.get(list.indexOf(CSV_COMMAND) + 1);
      file = new File(argumentValidationBuffer);
      if ((!file.isFile()) || (!argumentValidationBuffer.endsWith(CSV_EXTENSION))) {
        throw new IOException("Error: The CSV argument is not a valid CSV file.");
      }
      this.csvFile = argumentValidationBuffer;
    }
    // Validate email arguments from command line input.
    if (list.contains(EMAIL_COMMAND)) {
      if (!list.contains(EMAIL_TEMPLATE_COMMAND)) {
        throw new IOException("Error: --email provided but no --email-template was given.");
      } else {
        argumentValidationBuffer = list.get(list.indexOf(EMAIL_TEMPLATE_COMMAND) + 1);
        file = new File(argumentValidationBuffer);
        if ((!file.isFile()) || (!argumentValidationBuffer.endsWith(TEXT_EXTENSION))) {
          throw new IOException("Error: --email-template must be a .txt file.");
        }
        this.generateEmail = true;
        this.emailTemplate = importTemplate(argumentValidationBuffer);
      }
    }
    // Validate letter arguments from command line input.
    if (list.contains(LETTER_COMMAND)) {
      if (!list.contains(LETTER_TEMPLATE_COMMAND)) {
        throw new IOException("Error: --letter provided but no --letter-template was given.");
      } else {
        argumentValidationBuffer = list.get(list.indexOf(LETTER_TEMPLATE_COMMAND) + 1);
        file = new File(argumentValidationBuffer);
        if ((!file.isFile()) || (!argumentValidationBuffer.endsWith(TEXT_EXTENSION))) {
          throw new IOException("Error: --letter-template must be a .txt file.");
        }
        this.generateLetter = true;
        this.letterTemplate = importTemplate(argumentValidationBuffer);
      }
    }
    if (!(this.generateEmail || this.generateLetter)) {
      throw new IOException("Error: Either an email or letter must be generated.");
    }
  }

  /**
   * Import a .txt template using a file path attained from the command line.
   *
   * @param path the path to the template.
   * @return the text contents of the template file.
   * @throws IOException If the import is unsuccessful.
   */
  protected String importTemplate(String path) throws IOException {
    try {
      // Initialize new File and Scanner to import file.
      File templateFile = new File(path);
      Scanner scanner = new Scanner(templateFile);
      // Use delimiter "\\Z" to finish scanning at the end of the file.
      scanner.useDelimiter("\\Z");
      // Scan file and store in a String.
      String template = scanner.next();
      // Close scanner and return the String.
      scanner.close();
      return template;
    } catch (IOException exception) {
      throw new IOException("Error: The template was not successfully imported.");
    }
  }

  /**
   * @return The output directory for the email and letter files generated by the Automator.
   */
  public String getOutputDirectory() {
    return this.outputDirectory;
  }

  /**
   * @return The CSV file to parse for supporter data.
   */
  public String getCsvFile() {
    return this.csvFile;
  }

  /**
   * @return The email template to be used by the Automator.
   */
  public String getEmailTemplate() {
    return this.emailTemplate;
  }

  /**
   * @return The letter template to be used by the Automator.
   */
  public String getLetterTemplate() {
    return this.letterTemplate;
  }

  /**
   * @return True if an email is to be generated, False if an email is not to be generated.
   */
  public Boolean getGenerateEmail() {
    return this.generateEmail;
  }

  /**
   * @return True if a letter is to be generated, False if an email is not to be generated.
   */
  public Boolean getGenerateLetter() {
    return this.generateLetter;
  }

  /**
   * @return A unique string concatenation pertaining to this CommandLineParser.
   */
  @Override
  public String toString() {
    return "CommandLineParser{" +
        "generateEmail=" + this.generateEmail +
        ", generateLetter=" + this.generateLetter +
        ", outputDirectory='" + this.outputDirectory + '\'' +
        ", csvFile='" + this.csvFile + '\'' +
        ", emailTemplate='" + this.emailTemplate + '\'' +
        ", letterTemplate='" + this.letterTemplate + '\'' +
        '}';
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
    if (!(o instanceof CommandLineParser)) {
      return false;
    }
    CommandLineParser that = (CommandLineParser) o;
    return this.generateEmail.equals(that.generateEmail) && this.generateLetter
        .equals(that.generateLetter) && this.csvFile.equals(that.csvFile) && this.emailTemplate
        .equals(that.emailTemplate) && this.letterTemplate.equals(that.letterTemplate);
  }

  /**
   * @return A unique hashCode pertaining to this CommandLineParser.
   */
  @Override
  public int hashCode() {
    return Objects
        .hash(this.generateEmail, this.generateLetter, this.csvFile, this.emailTemplate,
            this.letterTemplate);
  }
}