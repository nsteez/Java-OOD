package automator;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class CommandLineParserTest {

  private String emailArg = "--email";
  private String emailTemplateArg = "--email-template";
  private String emailTemplateCorrect = "email-template.txt";
  private String emailTemplateIncorrect = "email-template.t";
  private String letterArg = "--letter";
  private String letterTemplateArg = "--letter-template";
  private String letterTemplateCorrect = "letter-template.txt";
  private String letterTemplateIncorrect = "template.t";
  private String csvArg = "--csv-file";
  private String csvFileCorrect = "nonprofit-supporters.csv";
  private String directoryArg = "--output-dir";
  private String directoryCorrect = "../HW8";
  private String directoryIncorrect = "HW8";
  private String[] stringArray;
  private String[] stringArray2;
  private String[] stringArray3;
  private CommandLineParser parser;
  private CommandLineParser parser2;
  private CommandLineParser parser3;


  @Before
  public void setUp() throws IOException {
    stringArray2 = new String[]{csvArg, csvFileCorrect, directoryArg, directoryCorrect, emailArg,
        emailTemplateArg, emailTemplateCorrect, letterArg, letterTemplateArg, letterTemplateCorrect};
    parser2 = new CommandLineParser(stringArray2);
    stringArray3 = new String[]{csvArg, csvFileCorrect, directoryArg, directoryCorrect, emailArg,
        emailTemplateArg, emailTemplateCorrect, letterArg, letterTemplateArg, letterTemplateCorrect};
    parser3 = new CommandLineParser(stringArray3);
  }

  @Test (expected = IOException.class)
  public void parseCommandLine1() throws IOException {
    stringArray = new String[]{emailArg};
    parser = new CommandLineParser(stringArray);
    assertFalse(parser.getGenerateEmail());
    assertFalse(parser.getGenerateLetter());
  }

  @Test (expected = IOException.class)
  public void parseCommandLine2() throws IOException {
    stringArray = new String[]{emailArg, csvArg, directoryArg, directoryCorrect};
    parser = new CommandLineParser(stringArray);
    assertFalse(parser.getGenerateEmail());
    assertFalse(parser.getGenerateLetter());
    assertEquals(directoryCorrect, parser.getOutputDirectory());
  }

  @Test (expected = IOException.class)
  public void parseCommandLine3() throws IOException {
    stringArray = new String[]{emailArg, directoryArg, directoryIncorrect, csvArg};
    parser = new CommandLineParser(stringArray);
    assertFalse(parser.getGenerateEmail());
    assertFalse(parser.getGenerateLetter());
    assertNotEquals(directoryIncorrect, parser.getOutputDirectory());
  }

  @Test
  public void parseCommandLine4() throws IOException {
    stringArray = new String[]{csvArg, csvFileCorrect, directoryArg, directoryCorrect, emailArg,
        emailTemplateArg, emailTemplateCorrect};
    parser = new CommandLineParser(stringArray);
    assertTrue(parser.getGenerateEmail());
    assertFalse(parser.getGenerateLetter());
    assertNotEquals(directoryIncorrect, parser.getOutputDirectory());
  }

  @Test
  public void parseCommandLine5() throws IOException {
    stringArray = new String[]{csvArg, csvFileCorrect, directoryArg, directoryCorrect, letterArg,
        letterTemplateArg, letterTemplateCorrect};
    parser = new CommandLineParser(stringArray);
    assertFalse(parser.getGenerateEmail());
    assertTrue(parser.getGenerateLetter());
    assertEquals(directoryCorrect, parser.getOutputDirectory());
    assertNotEquals(null, parser.getLetterTemplate());
  }

  @Test
  public void parseCommandLine6() throws IOException {
    stringArray = new String[]{csvArg, csvFileCorrect, directoryArg, directoryCorrect, emailArg,
        emailTemplateArg, emailTemplateCorrect};
    parser = new CommandLineParser(stringArray);
    assertTrue(parser.getGenerateEmail());
    assertFalse(parser.getGenerateLetter());
    assertNotEquals(null, parser.getEmailTemplate());
    assertEquals(null, parser.getLetterTemplate());
  }

  @Test (expected = IOException.class)
  public void parseCommandLine7() throws IOException {
    stringArray = new String[]{csvArg, csvFileCorrect, directoryArg, directoryCorrect, emailArg,
        emailTemplateArg, emailTemplateIncorrect};
    parser = new CommandLineParser(stringArray);
    assertFalse(parser.getGenerateEmail());
    assertFalse(parser.getGenerateLetter());
    assertEquals(null, parser.getEmailTemplate());
    assertEquals(null, parser.getLetterTemplate());
  }

  @Test (expected = IOException.class)
  public void parseCommandLine8() throws IOException {
    stringArray = new String[]{directoryArg, directoryCorrect};
    parser = new CommandLineParser(stringArray);
  }

  @Test (expected = IOException.class)
  public void parseCommandLine9() throws IOException {
    stringArray = new String[]{directoryArg, directoryCorrect, csvArg, csvFileCorrect, emailArg};
    parser = new CommandLineParser(stringArray);
  }

  @Test (expected = IOException.class)
  public void parseCommandLine10() throws IOException {
    stringArray = new String[]{directoryArg, directoryCorrect, csvArg, csvFileCorrect, letterArg,
        letterTemplateArg, letterTemplateIncorrect};
    parser = new CommandLineParser(stringArray);
  }

  @Test (expected = IOException.class)
  public void parseCommandLine11() throws IOException {
    stringArray = new String[]{directoryArg, directoryCorrect, csvArg, csvFileCorrect};
    parser = new CommandLineParser(stringArray);
  }

  @Test
  public void importTemplate1() throws IOException {
    assertNotEquals(null, parser2.getEmailTemplate());
  }

  @Test (expected = IOException.class)
  public void importTemplate2() throws IOException {
    String falseFilePath = "file";
    String testTemplateError = parser2.importTemplate(falseFilePath);
  }

  @Test
  public void getOutputDirectory() {
    assertEquals(directoryCorrect, parser2.getOutputDirectory());
  }

  @Test
  public void getCsvFile() {
    assertEquals(csvFileCorrect, parser2.getCsvFile());
  }

  @Test
  public void getEmailTemplate() {
    assertNotEquals(null, parser2.getEmailTemplate());
  }

  @Test
  public void getLetterTemplate() {
    assertNotEquals(null, parser2.getLetterTemplate());
  }

  @Test
  public void getGenerateEmail() {
    assertTrue(parser2.getGenerateEmail());
  }

  @Test
  public void getGenerateLetter() {
    assertTrue(parser2.getGenerateLetter());
  }

  @Test
  public void testToString() throws IOException {
    assertEquals(parser2.toString(), parser3.toString());
  }

  @Test
  public void testEqualsReflexive() throws IOException {
    assertTrue(parser2.equals(parser2));
  }

  @Test
  public void testEqualsSymmetric() throws IOException {
    assertTrue(parser2.equals(parser3) & parser3.equals(parser2));
  }

  @Test
  public void testHashCode() throws IOException {
    assertEquals(parser2.hashCode(), parser3.hashCode());
    stringArray = new String[]{csvArg, csvFileCorrect, directoryArg, directoryCorrect, emailArg,
        emailTemplateArg, emailTemplateCorrect};
    parser = new CommandLineParser(stringArray);
    assertNotEquals(parser.hashCode(), parser3.hashCode());
  }
}