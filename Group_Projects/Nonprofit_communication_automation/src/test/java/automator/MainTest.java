package automator;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
  private String[] testArgs1 = {
      "--email",
      "--email-template", "email-template.txt",
      "--output-dir", "OUTPUTS",
      "--csv-file", "nonprofit-supporters.csv"
  };
  private String[] testArgs2 = {
      "--letter",
      "--letter-template", "letter-template.txt",
      "--output-dir", "OUTPUTS",
      "--csv-file", "nonprofit-supporters.csv"
  };
  private String[] testArgs3 = {
      "--letter",
      "--output-dir", "OUTPUTS",
      "--csv-file", "nonprofit-supporters.csv"
  };

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void main() throws IOException {
    Main.main(testArgs1);
    Main.main(testArgs2);
  }

  @Test
  public void mainError() throws IOException {
    Main.main(testArgs3);
  }
}