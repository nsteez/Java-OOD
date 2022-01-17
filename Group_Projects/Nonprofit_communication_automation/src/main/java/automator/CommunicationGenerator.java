package automator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.*;

/**
 * Represents a communication generator which uses a template and an output directory
 */
public class CommunicationGenerator {
  private final String template;
  private final String outputDirectory;

  /**
   * Creates a new communication generator object given a template and an output directory
   *
   * @param template a template file of the communication with fields in the format [[fieldName]]
   * @param outputDirectory the output directory that the files will be saved in
   */
  public CommunicationGenerator(String template, String outputDirectory) {
    this.template = template;
    this.outputDirectory = outputDirectory;
  }

  /**
   * Generates a new file using the generator's template and saves it in the output directory
   *
   * @param supporter the supporter that the file is to be addressed to
   * @param fileName the name that will be given to the new file
   */
  public void generate(Supporter supporter, String fileName) throws IOException {
    // compile a regex pattern for fields in the format [[fieldName]]
    Pattern pattern = Pattern.compile("\\[\\[(.+?)]]");
    // create a new matcher to match the patten in the template
    Matcher matcher = pattern.matcher(this.template);
    // create a new string buffer with the same size of the template
    StringBuffer buffer = new StringBuffer(this.template.length());
    // find matching keys in the template and replace them with their values from the supporter
    while (matcher.find()) {
      String key = matcher.group(1);
      matcher.appendReplacement(buffer, Matcher.quoteReplacement(supporter.getValue(key)));
    }
    // append the rest of the message to the string buffer
    matcher.appendTail(buffer);
    try {
      // create a new file in the output directory and give it the given file name
      File newFile = new File(this.outputDirectory, fileName);
      // open the new file for writing and write the string buffer to it
      FileWriter writer = new FileWriter(newFile);
      writer.write(buffer.toString());
      writer.close();
    } catch (IOException e) {
      throw new IOException("Error: Unable to generate requested communications in output directory.");
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationGenerator that = (CommunicationGenerator) o;
    return Objects.equals(template, that.template) && Objects
        .equals(outputDirectory, that.outputDirectory);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(template, outputDirectory);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "CommunicationGenerator{" +
        "template='" + template + '\'' +
        ", outputDirectory='" + outputDirectory + '\'' +
        '}';
  }
}
